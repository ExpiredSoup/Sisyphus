// Syphilis  🯇0🭅🮋 

// really really really painful interpreted langauge 
// heavily inspired by Brainfuck 


// you spelled Sisyphus wromg 
// that was intentional as its less painful to slowly succumb to the effects of Syphilis then write in this sin of a langauge 

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

public class Syphilis{
public static void main(String[] args) {


String code = "";// WRITE YOUR CODE HERE





byte[] memory = {0,0,0};
byte[] tape = {0,0,0,0,0,0,0,0};
byte pointer = 0;
byte mempointer = 0;

    for(int i=0; i < code.length(); i++){
    char loc = code.charAt(i);


    if (loc == 'i') {
        pointer++;
    } else if (loc == '1') {
        pointer--;
    } else if (loc == ',') {
        tape[pointer]--;
    } else if (loc == '.'){
        tape[pointer]++;
    } else if (loc == ';'){
        tape[pointer] = memory[mempointer];
    } else if (loc == ':'){
        memory[mempointer] = tape[pointer];
    } else if (loc == '*'){
        mempointer--;
    } else if (loc == '+'){
        mempointer++;
    } else if (loc == '|'){
        System.out.println((char)tape[pointer]);
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

    if (tape[pointer] > 255){
    System.exit(0);
    }else if (tape[pointer] < 0){
    System.exit(0);
    }
    
    if (memory[mempointer] > 255){
    System.exit(0);
    }else if (memory[mempointer] < 0){
    System.exit(0);
    }

    }
}
}
