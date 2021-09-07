package com.javaex.nosql;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;


public class MongoDBTest {

	static String MONGODB_IP = "127.0.0.1";
	static int MONGODB_PORT = 27017;
	static String DB_NAME ="javaMongo";
	static String COLL_NAME = "testCollection";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		connect();

		getCollection();
//		testInsert();
		testInsertMany();
//		testFindFisrt();
//		testFindAll();
//		testFindFilter();
//		testUpdateOne();
//		testUpdateMany();
		testDeletAll();
//		testDeletOne();
//		testDeletMany();
	}
	
	private static void testDeletMany()
	{
		MongoCollection<Document> collection =
				getCollection();
		Bson DFilter = Filters.eq("gender","여성");
		DeleteResult res = collection.deleteMany(DFilter);
		System.out.println(res.getDeletedCount()+"개 삭제");
	}
	private static void testDeletOne()
	{
		MongoCollection<Document> collection =
				getCollection();
		Bson DFilter = Filters.eq("gender","여성");
		DeleteResult res = collection.deleteOne(DFilter);
		System.out.println(res.getDeletedCount()+"개 삭제");
	}
	private static void testDeletAll()
	{
		MongoCollection<Document> collection =
				getCollection();
		DeleteResult res = collection.deleteMany(new Document());
		System.out.println(res.getDeletedCount()+"개 레코드 삭제");
	}
	private static void testUpdateMany() {
		MongoCollection<Document> collection =
				getCollection();
		Bson bsonFilter = Filters.eq("species","인간");

		Bson doc = new Document("$set", new Document("method","updateMany")
								.append("updateDate", new Date()));
		
		UpdateResult res = collection.updateMany(bsonFilter, doc);
	}
	
	private static void testUpdateOne() {
		MongoCollection<Document> collection =
				getCollection();
		
		Bson bsonFilter = Filters.eq("species","인간");

		Bson doc = new Document("$set", new Document("method","updateOne"));
		
		UpdateResult res = collection.updateOne(bsonFilter, doc);
		System.out.println(res.getModifiedCount()+"개의 업데이트");
	}
	private static void testFindFilter()
	{
		MongoCollection<Document> collection =
				getCollection();
		
//		Bson bsonFilter = Filters.eq("species","인간");
//		복합조건
//		* species = 인간 || gender = 여성
		Bson bsonFilter = Filters.or(
				Filters.eq("species","인간"),
				Filters.eq("gender","여성")
				);
		
		
		MongoCursor<Document> cursor = collection.find(bsonFilter).iterator();
		System.out.println("cursor: "+cursor.toString());
		while(cursor.hasNext())
		{
			
			Document doc = cursor.next();
			
			System.out.printf("%s, %s, %s, %s%n",doc.get("_id"),doc.get("name"),doc.get("species")
					,doc.get("gender"));
			System.out.println("JSON:"+doc.toJson());
			
		}
		cursor.close();
	}
	private static void testFindAll()
	{
		MongoCollection<Document> collection =
				getCollection();
		MongoCursor<Document> cursor = collection.find().iterator();
		System.out.println("cursor: "+cursor.toString());
		while(cursor.hasNext())
		{
			Document doc = cursor.next();
			System.out.printf("%s, %s, %s, %s%n",doc.get("_id"),doc.get("name"),doc.get("species")
					,doc.get("gender"));
			System.out.println("JSON:"+doc.toJson());
			
		}
		cursor.close();
	}
	private static void testFindFisrt() {
		MongoCollection<Document> collection =
				getCollection();
		Document doc = collection.find().first();
//		find는 cursor 반환
		System.out.println("doc:"+doc);
//		필드명 확인 
		System.out.printf("%s, %s, %s, %s%n",doc.get("_id"),doc.get("name"),doc.get("species")
				,doc.get("gender"));
//		document => JSON
		System.out.println("JSON:"+doc.toJson());
	}
	private static void testInsertMany()
	{
//		여러 Doument Insert
//		insertMany(배열)
		List<Document> docs = new ArrayList<>();
		Document doc = new Document("name","고길동")
					.append("species", "인간")
					.append("gender", "남성");
		docs.add(doc);
		doc = new Document("name","도우너")
				.append("species", "외계인")
				.append("gender", "남성");
		docs.add(doc);
		doc = new Document("name","마이콜")
				.append("species", "인간")
				.append("gender", "남성");
		docs.add(doc);
		doc = new Document("name","또치")
				.append("species", "타조")
				.append("gender", "여성");
		docs.add(doc);
		System.out.println("삽입할 문서:"+docs);
		
		MongoCollection<Document> collection =
				getCollection();
		collection.insertMany(docs);
	}
	
	
	private static MongoCollection<Document>
		getCollection()
	{
//		DB접속
		MongoClient client = connect();
		MongoDatabase db = client.getDatabase(DB_NAME);
		MongoCollection<Document> collection = db.getCollection(COLL_NAME);
		
		System.out.println("Database:"+db);
		System.out.println("Collection:"+collection);
		
		return collection;
		
	}
	private static void testInsert() {
//		JSON(BSON)
		Document doc = new Document("name","둘리").append("gender", "남성")
						.append("species", "공룡");
		System.out.println("문서:"+doc);
		System.out.println("JSON"+doc.toJson());
		
		MongoCollection<Document> collection =
				getCollection();
		collection.insertOne(doc);
				
	}
	
	private static MongoClient connect() {
//		MongoDB에 접속
		MongoClient client = MongoClients.create();//기본정보는 자동으로 localhost:27017
//		MongoClient client = MongoClients.create(
////				접속정보가 기본정보가 아닐때
//				MongoClientSettings.builder()
//				.applyToClusterSettings(Builder -> 
//					builder.hosts(Array.asList(new ServerAddress(MONGODB_IP,MONGODB_PORT)))
//				).build();
		System.out.println(client);
		return client;
	}

}
