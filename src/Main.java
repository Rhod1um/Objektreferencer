public class Main {

    void go(){
        Car c1 = new Car("ABC");
        Car c2 = c1;
        System.out.println(c1);
        System.out.println(c1.getRegNo());
        System.out.println(c2.getRegNo()); //giver det samme
        c2.setRegNo("DEF");
        System.out.println(c1.getRegNo());
        System.out.println(c2.getRegNo()); //giver også det samme da c1 og c2 er den samme så adde
        // til en ene adder til den anden
        //Man skulle lave en new instans for at have to forskellige biler
        //c1 og c2 peger begge på Car instancen.
        // Men man ville kunne have den ene reference pege på den anden og det
        System.out.println(c1 + " " + c2); //de har samme reference. c1 og c2 er variable, hexadecimaltallet
        // er selve referencen som variablere indeholder
        c1 = null;
        System.out.println(c1); //giver null. Referencen er nul, Car instancen er ikke
        System.out.println(c2); //c2 kan stadig bruges og dette udskriver bare instansreferencen
        System.out.println(c2.getRegNo()); //udskriver DEF
        //sættes begge referencer til null sletter java selv instancen. Selve instancen fra new. I andre sprog skal
//selv rydde op
        //vil man tage en reel kopi af en instans skal man oprette en ny instans og kopiere alle attrbutter over
    }
    //Car referere til en String, begge er klasser.
    //Car instansen oprettes kun når new bruges. resten er referencer. c1 er en reference
    //c2 er en til reference.

    public static void main(String[] args) {
        new Main().go();

        

        Car[] cars = new Car[4]; //arrays af Car

        for (int i=0; i<cars.length; i++){
            cars[i] = new Car("ABC"); //forloop der instantiere hver instans i cars arrayet
        }

        //ved simple datatyper kopiere den værdien og ligger over i en ny variabel frem for
        //at bruge referencer
        //int i = 5;
        //int j = i; i og j er to forskellige variabler hvor værdien af den ene kopieres over i den anden
        //de to har forskellige hukommelsesadresser
        //spare det ikke på hukommelsen at bruge referencer til simple datatyper? Nej for
        //referencen fylder 8 bytes mens int fylder 4.
    }
}
//navne til filer?
//hvis hexadecimalet er referencen, hvor peger det så hen hvis ikke til adressen? Det peger på
//instancen. Men hvor er der så noget der peger på hukommelsesaddressen, er det i bytecode/java virtual machine?
//hvad sagde du med at den sletter car når den ikek er i scope

//sættes begge referencer til null sletter java selv instancen. Selve instancen fra new. I andre sprog skal
//selv rydde op
