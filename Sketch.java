import processing.core.PApplet;

public class Sketch extends PApplet {

  /**
   * Assignment: 5.6 Processing Task 5 - Loop Lab
   * Author: Lydia He
   * Date: Wed Mar 30, 2022
   * Task: Apply understanding of for loops, 
   * if statements and nested loops to form 
   * interesting patterns
   */
  
  public void settings() {
	// put your size call here
    size(1200, 600);
  }

  public void setup() {
    background(93, 138, 168);
  }

  public void draw() {
	  
    draw_section_outlines();
    draw_section1();
    draw_section2();
    draw_section3();
    draw_section4();
	  
    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();

    
  }

  /**
   * Draw the outlines for all sections
   */
  public void draw_section_outlines(){
    stroke(0);
    noFill();

    // draw bottom row boxes
    rect(0,300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    // draw top row boxes
    rect(0, 0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }
  
  // section 1
  public void draw_section1(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        intX = 3 + intRow * 10;  //Instead of zero, calculate the proper intX location using 'intRow'
        intY = 303 + intColumn * 10; //Instead of zero, calculate the proper intY location using 'intColumn'

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  /**
   * Use the modulus operator and an if statement to select the color
   * Don't loop from 30 to 60 to shift everything over, just add 300 to x.
   */
  public void draw_section2(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        intX = 303 + intRow * 10; 
        intY = 303 + intColumn * 10; 

        fill(0);
        rect(intX, intY, 5, 5);

        // black squares
        if(intRow % 2 == 0){
          fill(255);
          noStroke();
          rect(intX, intY, 5, 5);
        }
      }
    }
  }
  /**
   * Use the modulus operator and an if/else statement to select the color.
   * Don't use multiple 'if' statements.
   */
  public void draw_section3(){
    int intX = 0;
    int intY = 0;

    for (int intRow = 0; intRow < 30; intRow++) {
      for (int intColumn = 0; intColumn < 30; intColumn++) {
        intX = 603 + intRow * 10;
        intY = 303 + intColumn * 10;

        // black squares
        if(intColumn % 2 == 0){
          fill(0);
          noStroke();
          rect(intX, intY, 5, 5);

        // white squares
        } else {
          fill(255);
          noStroke();
          rect(intX, intY, 5, 5);
        }
      }
    }
  }

  /**
   * Use the modulus operator and just one 'if' statement to select the color.
   */
  public void draw_section4(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++) {
      for(int intColumn = 0; intColumn < 30; intColumn++) {
        intX = 903 + intRow * 10;  
        intY = 303 + intColumn * 10;

        // black squares 
        fill(0);
        noStroke();
        rect(intX, intY, 5, 5); 
        
        // white squares
        if(intRow % 2 == 0 && intColumn % 2 == 1 ){
          fill(255);
          noStroke();
          rect(intX, intY, 5, 5); 
        }
      }
    }
  }

  /**
   * Do NOT use 'if' statements to complete 5-8. Manipulate the loops instead
   */
  public void draw_section5(){
    int intX = 0;
    int intY = 0;

    for(int intColumn = 0; intColumn < 300; intColumn += 10){
      for(int intRow = 300 - intColumn; intRow < 300; intRow += 10){
        intX = 3 + intRow;
        intY = 3 + intColumn;

    // squares from bottom left to top right, filling in right half
        noStroke();
        fill(255);
        rect(intX, intY, 5, 5);
    }
  }
}
  
  // section 6
  public void draw_section6(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 290; intRow >= 0; intRow -= 10){
      for(int intColumn = 290; intColumn >= intRow; intColumn -= 10){
        intX = 303 + intRow;
        intY = 3 + intColumn;

    // squares from top left to bottom right, filling in left half
        noStroke();
        fill(255);
        rect(intX, intY, 5, 5);
      }
    }
  }

  // section 7
  public void draw_section7(){
    int intX = 0;
    int intY = 0;

    for(int intColumn = 0; intColumn < 300; intColumn += 10){
      for(int intRow = 290 - intColumn; intRow >= 0; intRow -= 10){
        intX = 603 + intRow;
        intY = 3 + intColumn;

    // squares from top right to bottom left, filling in left half
        noStroke();
        fill(255);
        rect(intX, intY, 5, 5);
      }
    }
  }

  // section 8
  public void draw_section8(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 300; intRow += 10){
      for(int intColumn = 0; intColumn <= intRow; intColumn += 10){
        intX = 903 + intRow;
        intY = 3 + intColumn;

    // squares from top left to bottom right, filling in right half
        noStroke();
        fill(255);
        rect(intX, intY, 5, 5);
      }
    }
  }
}