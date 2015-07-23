package ba.bitcamp.museum;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Artwork a1 = new Artwork(1, "Artwork1", "Description of artifact", "Author", Artwork.Period.MODERN);
		Artwork a2 = new Artwork(2, "Artwork1", "Description of artifact", "Author", Artwork.Period.NEO);
		Artwork a3 = new Artwork(3, "Artwork1", "Description of artifact", "Author", Artwork.Period.CONTEMPORARY_ART);
		
		HistoricalArtifacts ha1 = new HistoricalArtifacts(1, "Historical1", "Historical artifact description of first", "Origin of first artifact", HistoricalArtifacts.Period.MIDDLE_AGES);
		HistoricalArtifacts ha2 = new HistoricalArtifacts(2, "Historical2", "Historical artifact description of second", "Origin of second artifact", HistoricalArtifacts.Period.MODERN_TIME);
		HistoricalArtifacts ha3 = new HistoricalArtifacts(3, "Historical3", "Historical artifact description of third", "Origin of third artifact", HistoricalArtifacts.Period.CLASSICS);
		
		ArrayList<Artwork> listOfArtwork = new ArrayList<Artwork>();
		
		listOfArtwork.add(a1);
		listOfArtwork.add(a2);
		listOfArtwork.add(a3);
		
		ArrayList<HistoricalArtifacts> listOfHistoricalArtifacts = new ArrayList<HistoricalArtifacts>();
		
		listOfHistoricalArtifacts.add(ha1);
		listOfHistoricalArtifacts.add(ha2);
		listOfHistoricalArtifacts.add(ha3);
		
		// fits search test
		System.out.println(ha1.fitsSearch("kabum"));
	}
}
