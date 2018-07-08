#Chess
This started out as a student project for a Comp Sci class my son was taking. He asked if I could help him with the project and my inner geek agreed wholeheartedly! <i>we got an A BTW</i>
##Design Decisions
The pieces classes (interface, base class, piece classes) have no idea how they are used. They only *know* who they are, their address, and how they move/take pieces.

The board class is responsible for gameplay.  It keeps track of where everything is and the **rules** of chess.

The Controller class handles turns and communication with the players.

The Gutter class (currently not implemented) keeps track of the pieces once they are taken from the board.

The AI class (currently not implemented) represents the "computer player".  Initially I plan to hard code the rules.  Eventually, this will be my deep-dive into machine learning.

User interface. The crude ASCII rendering was borrowed from a "Connect Four" game I had to write for my Comp Sci A.S.  It will eventually be replaced by reasonable graphics.
