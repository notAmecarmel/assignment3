class TouristSpots {

    void displayFood() {
        System.out.println("Common dishes at this location");
    }

    void displayAttractions() {
        System.out.println("Major attractions at this location");
    }

    public static void main(String[] args) {

        TouristSpots spot;

        spot = new ManaliPlace();
        spot.displayFood();
        spot.displayAttractions();

        spot = new DarjeelingPlace();
        spot.displayFood();
        spot.displayAttractions();

        spot = new OotyPlace();
        spot.displayFood();
        spot.displayAttractions();
    }
}

// Subclass 1
class ManaliPlace extends TouristSpots {

    @Override
    void displayFood() {
        System.out.println("Manali Food: Siddu and Babru");
    }

    @Override
    void displayAttractions() {
        System.out.println("Manali Attractions: Snowfall and Adventure Activities");
    }
}

// Subclass 2
class DarjeelingPlace extends TouristSpots {

    @Override
    void displayFood() {
        System.out.println("Darjeeling Food: Momos and Thukpa");
    }

    @Override
    void displayAttractions() {
        System.out.println("Darjeeling Attractions: Tea Gardens and Sunrise Point");
    }
}

// Subclass 3
class OotyPlace extends TouristSpots {

    @Override
    void displayFood() {
        System.out.println("Ooty Food: Chocolates and Varkey");
    }

    @Override
    void displayAttractions() {
        System.out.println("Ooty Attractions: Hills and Toy Train");
    }
}