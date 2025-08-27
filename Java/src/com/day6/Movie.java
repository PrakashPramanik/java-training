package com.day6;




 
// Movie class implements Comparable
// interface to define default sorting
class Movie implements Comparable<Movie> {
   private String name; 
   private double rating;
   private Integer year; 
 
   // Constructor 
   public Movie(String name, double rating, int year) {
       this.name = name;
       this.rating = rating;
       this.year = year;
   }
 
   // Implementation of the compareTo method 
   // for default sorting by year
   public int compareTo(Movie m) {
      
       // Sort movies in ascending 
       // order of year
//       return this.year - m.year;
	   return this.year.compareTo(m.year);
   }
 
   // Getter methods
   public String getName() {
       return name;
   }
 
   public double getRating() {
       return rating;
   }
 
   public int getYear() {
       return year;
   }
}
