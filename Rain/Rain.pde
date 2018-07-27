int y = 100;
int randomNumber = (int) random(492);
void setup()
{
  size(500,500);
}
void draw()
{
  background(17,255,153);
  fill(000,136,255);
stroke(000 , 68, 204);
ellipse(randomNumber,y, 15, 30);
y+= 50;
if(y > 515)
{
 y = -15; 
 randomNumber = (int) random(492);
}
}