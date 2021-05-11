package _05_netflix;

public class Netflix {
public static void main(String[] args) {
	Movie theMeg = new Movie("The Meg", 5);
	Movie missionImpossible = new Movie("Mission: Impossible", 4);
	Movie separation = new Movie("Separation", 3);
	Movie homeAlone = new Movie("Home Alone", 4);
	Movie bankJob = new Movie("The Bank Job", 5);
	bankJob.getTicketPrice();
	NetflixQueue queue = new NetflixQueue();
	queue.addMovie(theMeg);
	queue.addMovie(missionImpossible);
	queue.addMovie(separation);
	queue.addMovie(homeAlone);
	queue.addMovie(bankJob);
	queue.printMovies();
	Movie bestMovie = queue.getBestMovie();
	System.out.println("The best movie is " + bestMovie);
	Movie secondBestMovie = queue.getMovie(2);
	System.out.println("The second best movie is " + secondBestMovie);
	
}
}
