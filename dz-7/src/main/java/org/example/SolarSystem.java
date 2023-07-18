package org.example;

public enum SolarSystem {
    MERCURY(0, 50, null),
    SATURN(10, 100, MERCURY),
    JUPITER(20, 150, SATURN),
    MARS(30, 200, JUPITER),
    EARTH(40, 250, MARS);

    final public int orderNum;
    final public int prevDistance;
    final public int radius;
    final public int distancePlanetToSun;
    private SolarSystem previous;
    private SolarSystem next;


    SolarSystem(int prevDistance, int radius, SolarSystem previous) {
        this.prevDistance = prevDistance;
        this.radius = radius;
        this.previous = previous;

        if (previous == null) {
            this.orderNum = 1;
            this.distancePlanetToSun = 50;
        } else {
            this.orderNum = previous.orderNum + 1;
            this.distancePlanetToSun = previous.distancePlanetToSun + prevDistance;
        }

        if (previous != null) {
            this.previous.next = this;
        }
    }


       public int getOrderNum() {
       return orderNum;
       }

       public int getDistancePlanetToSun() {
           return distancePlanetToSun;
       }

       public int getPrevDistance() {
       return prevDistance;
       }

       public int getRadius() {
       return radius;
       }

       public SolarSystem getPrevious() {
       return previous;
       }

        public SolarSystem getNext() {
        return next;
        }

}
