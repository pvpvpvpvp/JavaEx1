package com.javaex.oop.song.v1;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;

	public Song(String title,String artist) {
		setTitle(title);
		setArtist(artist);
	}
	public Song(String title,String artist,String album, String composer, int year,int track) {
		this(title,artist);//첫째줄에서 호출해야 에러안남
		setAlbum(album);
		setComposer(composer);
		setTrack(track);
		setYear(year);
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setTrack(int track) {
		this.track = track;
	}
	
	public void showInfo() {
		System.out.printf("%s, %s ( %s, %d, %d번 track, %s 작곡 )",artist,title,album,year,track,composer);
		
	}
	
}
