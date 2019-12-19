PImage bucket;
void setup(){
  size(500, 500);
  bucket = loadImage("dino.png");
  bucket.resize(60,25);
}
int speed = 1;
int y = 30;
int x = (int) random(width);
int score = 0;
void draw(){
 background(#00E8FF); 
    fill(#FF0004);
    stroke(#10E0DE);
    ellipse(x, y, 10, 20);
    fill(#7C7C7C);
   // rect(mouseX-23, 480, 46, 35);
   image(bucket,mouseX,480);
    y = y + speed;
    if (y >= 500){
      checkCatch(x);
      y = 30;
      x = (int) random(width);
    }  
    fill(0, 0, 0);
    textSize(16);
    text("Score: " + score, 20, 20);
} 
 void checkCatch(int x){
         if (x > mouseX-23 && x < mouseX+23){
            score++;
            speed = speed +1;
         }   
         else if (score > 0) {
            score--;
            speed--;
         }
        println("Your score is now: " + score);
    }
