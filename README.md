# EXAM: Java Basics Retake

### Getting Started
 - Fork this repository under your own account
 - Clone the forked repository to your computer
 - Commit your progress frequently and with descriptive commit messages
 - All your answers and solutions should go in this repository

### What can I use?
 - You can use any resource online, but **please work individually**
 - Instead of copy-pasting your answers and solutions, write them in your own words.

# Tasks
## 1. Setup a new project (~5 mins) [1p]
- Create a new project inside your cloned repository
- Setup `.gitignore` file to exclude the IDE's generated files
   - Just the src directory should be committed
- Create a package called `com.greenfox.exams.java.retake` and work under that


## 2. com.greenfox.exams.java.retake.Aircraft com.greenfox.exams.java.retake.Carrier Application (~100 mins) [25p]
The task is to create an application where you can add aircraft to an aircraft carrier.

### com.greenfox.exams.java.retake.Aircraft
Create a class that represents an aircraft.

There are 2 types of aircrafts: com.greenfox.exams.java.retake.F16 and com.greenfox.exams.java.retake.F35.

|Type|Max ammo | Base damage|
|:---|--------:|----:|
|com.greenfox.exams.java.retake.F16| 8|30|
|com.greenfox.exams.java.retake.F35|12|50|

All the aircraft should be created with 0 ammo.  They must be refilled either by their own method, or that of the com.greenfox.exams.java.retake.Carrier.

All aircrafts should be displayed as string like this: `Type com.greenfox.exams.java.retake.F35, Ammo: 10, Base Damage: 50, All Damage: 500`

### Methods

#### fight
When called, this method:-
- Uses up all of its ammos (depleting it to 0).  
- Returns the total amount of damage it can inflict.  This is computed as ammo * base damage.


#### refill
This method takes an input amount which is the number of rounds of ammo to be refilled (eg. add 5 to the ammo of the aircraft).

While the amount added can be any value: 
- An aircraft cannot have, in total, more ammo than its Max ammo
- If given more ammo than it can hold, the remainder is returned.

*For example, an com.greenfox.exams.java.retake.F16 can hold a maximum of 8 rounds of ammo.  Consider "A", a particular com.greenfox.exams.java.retake.F16 that holds 6 rounds.  When A.refill(4) runs it returns 2 (as 6 + 4 = 10, but as only 8 can be stored, 2 are returned).*

### com.greenfox.exams.java.retake.Carrier
Create a class that represents an aircraft carrier.  The com.greenfox.exams.java.retake.Carrier class must:
- Store aircraft
- Track the total ammo it is loaded with and this value is given when the com.greenfox.exams.java.retake.Carrier is constructed
- Initialised with a starting number of health points which is 3,000

For an aircraft carrier, the `toString()` reports as follows:-
```
com.greenfox.exams.java.retake.Aircraft count: 5, Ammo Storage: 2300, Total damage: 2280, Health Remaining: 720
Aircrafts:
Type com.greenfox.exams.java.retake.F35, Ammo: 12, Base Damage: 50, All Damage: 600
Type com.greenfox.exams.java.retake.F35, Ammo: 12, Base Damage: 50, All Damage: 600
Type com.greenfox.exams.java.retake.F35, Ammo: 12, Base Damage: 50, All Damage: 600
Type com.greenfox.exams.java.retake.F16, Ammo: 8, Base Damage: 30, All Damage: 240
Type com.greenfox.exams.java.retake.F16, Ammo: 8, Base Damage: 30, All Damage: 240
```
If the com.greenfox.exams.java.retake.Carrier's health points fall to 0 (or less) then the `toString()` instead returns `It's dead Jim :(`.

### Methods

#### addAircraft
This adds an aircraft of type (either com.greenfox.exams.java.retake.F16 or com.greenfox.exams.java.retake.F35) to the list of com.greenfox.exams.java.retake.Aircraft in (associated with) the com.greenfox.exams.java.retake.Carrier.  For example `.addAircraft("com.greenfox.exams.java.retake.F16");`.

#### fill
This one method tops up all the aircraft associated with the com.greenfox.exams.java.retake.Carrier, filling them up with ammo, with the following rules:-
- The ammo it uses reduces its own stores equally (e.g. *if the carrier has 100 rounds, and refills "A" with 8, then the carrier has 92 rounds remaining*)
- If there is not enough ammo to refill all the aircraft, the F35s take priority and are refilled first
- It can only use the ammo it has, the ammo cannot go negative
- If called and there's no ammo remaining, then it must throw an error.

#### fight
This method must take another com.greenfox.exams.java.retake.Carrier as a parameter (aka `the target`) and it applies all the ammo from all of its associated aircraft (computing the same damage as before (Base * Ammo used) to reduce the health of the target.

## Understanding (15 mins) [4p]
Take a look at the following code!
```java
public class B {
    String s;

    public B(String s) {
        this.s = s;
    }

    public static String p(String z) {
        System.out.println(s);
        s += z;
        return z;
    }
}

public class com.greenfox.exams.java.retake.Main {
  public static void main(String[] args) {
    B b = new B("alma");
    System.out.println(b.p(b.p(b.p(b.p("korte")))));
  }
}
```
What's get printed out? [2p] What is wrong with the code currently and why? [2p]

#### Your answer:


