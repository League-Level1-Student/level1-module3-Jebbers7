package _06_gridworld;

import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridworldRunner {
public static void main(String[] args) {
World world = new World();
world.show();
Bug bug1 = new Bug();
Bug bug2 = new Bug();
Flower flower1 = new Flower();
Flower flower2 = new Flower();
bug2.setColor(Color.BLUE);
bug2.turn();
bug2.turn();
Location location1 = new Location(5,5);
Location location2 = new Location(1,2);
Location location3 = new Location(1,3);
Location location4 = new Location(1,1);
world.add(location3, flower1);
world.add(location4, flower2);
world.add(location1,bug1);
world.add(location2,bug2);
for(int row = 0; row < 10; row++) {
	for(int column = 0; column < 10; column++) {
		Location location = new Location(row,column);
		world.add(location, new Flower());
	}
}
}}
