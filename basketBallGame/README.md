BasketBall Game 

Author:
    Leander lorenz B. Lubguban
    July 30, 2023
    incoming 2nd yr cs

introduction:

I am going to make a 1 v 1 BasketBall.
future updates maybe {3v3, 5v5}, positions, defense
USE PlayerTest.java for MAIN METHOD

----------------------------------------------------------------

PATCHES:

NewFeature 1.4/ show game details
    - added a function to show what happened in the game.
    - when a tournament is finished it will only show who won.
    - the showGameDetails() function will display what happened.

Patch 1.3.1 ball possession
    - removed the hasball from the player object
    - transfereed the hasball to the one v one object.

Patch Function separation
    - Functions for defense are now separated

Patch StartONeVOne function
    - reworked the display of currents scores

NewFeature/1.3 ball possesion
    - changes on how the 1 v 1 works
    - added a boolean ball possesion token to know which player has the ball

NewFeature/1.2 rebounding 
    - Added a rebound for the 1v1 program

NewFeature/ 1.1 patch
    - Added new features such as a Shooting Contest object
    - a One versus One game without defensive actions.

PlayerShooting/1.0 patch 
    - shooting mechanic is based on a shooting rating.


--------------------------------------------------------------
TO CREATE A PLAYER
    - create a player object
    syntax : Player refVariable = new Player(String name, int rating, int rating);

TO CREATE A SHOOTING CONTEST
    - you will need atleast two players to compete
    - create a ShootingContest Object 
        syntax : ShootingContest refVariable = new ShootingContest();
    - to add a  player to the contest the syntax is refVariable.add(Player p);
    - to start a contest the syntax is refVariable.startContest();

TO START A 1v1 game
    - you need atleast two players to participate of course
    - create a OneVOne object
        syntax : OneVOne refVariable = new OneVOne(Player p1, Player p2);
    - to start a one v one the syntax is refVariable.startOneVOne();

------------------------------------------------------------
Basic Mechanics
Shooting: 

prototype 1
    using random int with percentages

    wide open shots:

        public boolean Shoot(){
            double pct = Math.random()*100;
            if((pct -= shootingRate) < 0) return true;
            else return false;
        }

prototype 2

    blocking mechanics

    block rating for players will affect the shooting chance of opponent


--------------------------------------------------------------
Elements
1. Players
    ATTRIBUTES
    - JerseyNumber
    - PlayerName

    - height
    - wingspan
    - speed
    - dribbling
    - IQ
    - Stamina

    OFFENSE
    - dunk rating
    - 3pt shooting rating
    - midrange rating

    DEFENSE
    - Block
    - Steal

    OFFENSIVE RATING
    DEFENSIVE RATING
    OVERALL RATING



