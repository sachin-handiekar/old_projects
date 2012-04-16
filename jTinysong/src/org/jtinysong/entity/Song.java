package org.jtinysong.entity;

import com.google.gson.annotations.SerializedName;

public class Song {

	@SerializedName("Url")
	private String songUrl;

	@SerializedName("SongID")
	private int songId;

	@SerializedName("SongName")
	private String songName;

	@SerializedName("ArtistID")
	private int artistId;

	@SerializedName("ArtistName")
	private String artistName;

	@SerializedName("AlbumID")
	private int albumId;

	@SerializedName("AlbumName")
	private String albumName;

	/**
	 * @return the songUrl
	 */
	public String getSongUrl() {
		return songUrl;
	}

	/**
	 * @param songUrl
	 *            the songUrl to set
	 */
	public void setSongUrl(String songUrl) {
		this.songUrl = songUrl;
	}

	/**
	 * @return the songId
	 */
	public int getSongId() {
		return songId;
	}

	/**
	 * @param songId
	 *            the songId to set
	 */
	public void setSongId(int songId) {
		this.songId = songId;
	}

	/**
	 * @return the songName
	 */
	public String getSongName() {
		return songName;
	}

	/**
	 * @param songName
	 *            the songName to set
	 */
	public void setSongName(String songName) {
		this.songName = songName;
	}

	/**
	 * @return the artistId
	 */
	public int getArtistId() {
		return artistId;
	}

	/**
	 * @param artistId
	 *            the artistId to set
	 */
	public void setArtistId(int artistId) {
		this.artistId = artistId;
	}

	/**
	 * @return the artistName
	 */
	public String getArtistName() {
		return artistName;
	}

	/**
	 * @param artistName
	 *            the artistName to set
	 */
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	/**
	 * @return the albumId
	 */
	public int getAlbumId() {
		return albumId;
	}

	/**
	 * @param albumId
	 *            the albumId to set
	 */
	public void setAlbumId(int albumId) {
		this.albumId = albumId;
	}

	/**
	 * @return the albumName
	 */
	public String getAlbumName() {
		return albumName;
	}

	/**
	 * @param albumName
	 *            the albumName to set
	 */
	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

}
