public class Car {
    int myStartMiles;
    int myEndMiles;
    double myGallonsUsed;

    Car(int odometerReading){
        myStartMiles = odometerReading;
    }

    void fillUp(int odometerReading, double gallons){
        myEndMiles = odometerReading;
        myGallonsUsed = gallons;
    }

    double calculateMPG(){
        return (myEndMiles - myStartMiles) / myGallonsUsed;
    }


    double resetMPG(){
        myStartMiles = myEndMiles;
        myGallonsUsed = 0;
        return myStartMiles;
    }
}
