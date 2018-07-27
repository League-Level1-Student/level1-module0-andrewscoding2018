int y = 100;
int score;
int randomNumber = (int) random(492);
void setup()
{
  size(500,500);
}
void draw()
{
  background(17,255,153);
  rect( mouseX - 10, 450, 100, 60);
  fill(000,136,255);
stroke(000 , 68, 204);
ellipse(randomNumber,y, 15, 30);
y+= 5;
checkCatch(randomNumber, y);
if(y > 515)
{
 y = -15; 
 randomNumber = (int) random(492);
}
fill(0, 0, 0);
textSize(16);
text("Score: " + score, 20, 20);
}
void checkCatch(int x, int y){
     if (x > mouseX && x < mouseX+100 && y > 450 )
          score++;
     else if (score > 0) 
          score--;
     println("Your score is now: " + score); }