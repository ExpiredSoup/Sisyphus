// Sisyphus  🯇0🭅🮋 

// really really really painful interpreted langauge 
// heavily inspired by Brainfuck 

// No pain no gain - albert einstein



// ---------------INSTRUCTIONS----------------//

//i move pointer in main tape left
//1 move pointer in main tape right
//, subtract current pointed value within tape
//. add current pointed value within tape
//; pointed value into mem
//: relese memory pointed value from mem into main tape
//| print ascii from pointed value 
// * move memory tape left
// + move memory tape right

// ---------------------------------------------//

import java.util.Arrays;

public class Sisyphus{
public static void main(String[] args) {


String code = "|,,,,,,,,|,,,,,,|...|:+|...............:**|:+;|...||.......|.............................+;*|........................................*;................................";





byte[] memory = {0,0,0};
byte[] tape = {0,0,0,0,0,0,0,0};
byte pointer = 0;
byte mempointer = 0;


    for(int i = code.length() - 1; i >= 0; i--){
    char loc = code.charAt(i);

    if (loc == 'i') {
        pointer++;
    } else if (loc == '1') {
        pointer--;
    } else if (loc == ',') {
        tape[pointer]--;
    } else if (loc == '.'){
        tape[pointer]++;
    } else if (loc == ':'){
        tape[pointer] = memory[mempointer];
    } else if (loc == ';'){
        memory[mempointer] = tape[pointer];
    } else if (loc == '*'){
        mempointer--;
    } else if (loc == '+'){
        mempointer++;
    } else if (loc == '|'){
        System.out.print((char)tape[pointer]);
    } else {
        System.exit(0);
    }
    
    
    if (mempointer > 2) {
        mempointer = 0;
    }else if (mempointer < 0) {
        mempointer = 2;
    }

    if (pointer > 7) {
        pointer = 0;
    }else if (pointer < 0) {
        pointer = 7;
    }

    if (tape[pointer] > 127){
    System.exit(0);
    }else if (tape[pointer] < 0){
    System.exit(0);
    }
    
    if (memory[mempointer] > 127){
    System.exit(0);
    }else if (memory[mempointer] < 0){
    System.exit(0);
    }

    }
}

}