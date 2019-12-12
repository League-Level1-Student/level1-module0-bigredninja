void setup(){
  size(500, 500);
  
}

int y = 30;

void draw(){
 background(#00E8FF); 
    fill(#FF0004);
    stroke(#10E0DE);
    ellipse(30, y, 10, 20);
    y = y + 1;
    if (y == 500){
      y = 30;
    }  
} 
