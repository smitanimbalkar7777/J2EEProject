package com.jspiders.musicplayer;
  
import java.util.ArrayList;
import java.util.Scanner;

public class SongOperation {
	Scanner sc=new Scanner(System.in);
	ArrayList<song>list=new ArrayList<song>();

	public void addSong() {
		System.out.println("How any songs you want to add!");
		int addCount=sc.nextInt();
		for(int i=0;i<addCount;i++) {
			com.jspiders.musicplayer.song song=new song();
			System.out.println("Enter the Id for Song:");
			song.setId(sc.nextInt());
			System.out.println("Enter the Name of Song:");
			song.setSongName(sc.next());
			System.out.println("Enter the Singer Name:");
			song.setSingerName(sc.next());
			System.out.println("Enter the movie name of the song:");
			song.setmovieName(sc.next());
			
			System.out.println("Enter the Name of the composer:");
			song.setLyrist(sc.next());
			
			System.out.println("Enter the Duration time of the song:");
			song.setDuration(sc.nextDouble());
			
			list.add(song);
			System.out.println("Added"+song.songName+"song Successfully");
			
		}
		
	}

public void displayAllSongs() {
	if(list.isEmpty()) {
		System.out.println("Add songs then you will get SongList...");
		addSong();
	}
	for(song song:list) {
		System.out.println(song.getSongName());
	}
}
public void removeSong() {
	if(list.isEmpty()) {
		System.out.println("Add songs then Remove..");
				addSong();
	}
	System.out.println("Select song to remove");
	displayAllSongs();
	int removeId=sc.nextInt();
	System.out.println(list.get(removeId-1).getSongName()+"removed Successfully...");
	list.remove(removeId-1);
	displayAllSongs();
}
public void updateSong() {
	if(list.isEmpty()) {
		                                                                                                                                                                                                                                                                                           
	System.out.println("Add songs then update..");
	addSong();
	}
	System.out.println("Select song to update");
	displayAllSongs();
	int update=sc.nextInt();
	list.remove(update-1);
	song song1=new song();
	
	System.out.println("Enter the Id for Song:");
	song1.setId(sc.nextInt());
	
	System.out.println("Enter the Name of Song:");
	song1.setSongName(sc.next());
	
	System.out.println("Enter the Singer Name:");
	song1.setSingerName(sc.next());

	System.out.println("Enter the Name of the Composer");
	song1.setComposer(sc.next());

    System.out.println("Enter the Name of lyrist");
    song1.setLyrist(sc.next());
    
    System.out.println("Enter the Duration time of the song:");
    double duration=sc.nextDouble();
    song1.setDuration(duration);
    
    list.add(update -1,song1);
    System.out.println(list.get(update-1).getSongName()+"Updated Song details Successfully");
}
    
    public void chooseToPlay1() {
    	if(list.isEmpty()) {
    		System.out.println("Add songs then play..");
    addSong();
}
System.out.println("Select song to Play ");
displayAllSongs();
int play=sc.nextInt();
System.out.println("Playing song"+list.get(play -1).getSongName());

    }
    public void playAllSongs() {
    	if(list.isEmpty()) {
    		System.out.println("Add songs then play..");
    		addSong();
    	}
System.out.println("Playing All songs");
for(song song:list) {
	System.out.println(song.getSongName());
}
    }

public void playRandomSong() {
	if(list.isEmpty()) {
		System.out.println("Add songs then play..");
		addSong();
	}
	System.out.println("Playing Random songs" );
	double number=Math.random();
	int random=(int)(number*10)+1;
	if(random>list.size()) {
		random=0;
	}System.out.println("Playing song"+list.get(random).getSongName());
}

public void chooseeToPlay() {
	// TODO Auto-generated method stub
	
}

public void chooseToPlay() {
	// TODO Auto-generated method stub
	
}

	
}	
	





	
