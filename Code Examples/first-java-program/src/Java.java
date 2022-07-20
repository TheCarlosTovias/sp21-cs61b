public class Java {
    public static void main(String[] args) {
        int size = 27;
        String name = "Fido";

        Dog myDog = new Dog(name,size);
        Dog yourDog = new Dog("Scruffy", 1000);
        System.out.println(myDog);
        System.out.println(yourDog);

        Dog[] dogList = new Dog[3];
        dogList[0] = myDog;
        dogList[1] = yourDog;
        dogList[1].size(5);
        dogList[2] = new Dog("Cutie", 8);

        for (int i = 0; i < dogList.length; i++) {
            System.out.println(dogList[i]);
        }


        int x;
        x = size - 5;
        if (x < 25) {
            myDog.bark();
        }

    }
}
