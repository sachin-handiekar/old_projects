#jTinysong

A Java wrapper for the [TinySong API](http://tinysong.com/api)

##How to use ?
 
* Declare an instance of Tinysong

```java
String apiKey = "Your API Key";
Tinysong tiny = new Tinysong(apiKey);
```

* Get Song

```java
String query = "All of the lights";
Song song = tiny.getSong(query);		

System.out.println("Url - "         + song.getSongUrl());
System.out.println("Song ID - "     + song.getSongId());
System.out.println("Song Name - "   + song.getSongName());
System.out.println("Artist ID - "   + song.getArtistId());
System.out.println("Artist Name - " + song.getArtistName());
System.out.println("Album ID - "    + song.getAlbumId());
System.out.println("Album Name - "  + song.getAlbumName());
``` 
		
* Get Song List

```java
Song[] songs = tiny.getSongs("Kanye West", 5);

for(Song song : songs) {
	System.out.println("Url - " + song.getSongUrl());
	System.out.println("Song ID - " + song.getSongId());
	System.out.println("Song Name - " + song.getSongName());
	System.out.println("Artist ID - " + song.getArtistId() );
	System.out.println("Artist Name - " + song.getArtistName() );
	System.out.println("Album ID - " + song.getAlbumId());
	System.out.println("Album Name - " + song.getAlbumName() );
	System.out.println();
	
}
		
```

##Dependencies

* Google GSON (http://code.google.com/p/google-gson/)


##About me

* [LinkedIn](http://uk.linkedin.com/in/sachinhandiekar)
* Email   : sachin.handiekar at gmail.com / sach21 at gmail.com
* Twitter : [@sachinhandiekar](http://twitter.com/sachinhandiekar)