float x = 0;
float y = 0;
int a = 0;
int b = 0;
int c = 0;
void setup()
{
 size(500, 500);
 background(255, 102, 34) ;
}
void draw()
{
float a = random(255);
float b = random(255);
float c = random(255);
  fill(a ,b, c);
   x = random(500);
   y = random(500);
   stroke(a,b,c);
    ellipse(getWormX(8),getWormY(9),60,60);

}
float frequency = .001;
float noiseInterval = PI;

void makeMagical() {
     fill( 0, 0, 0, 10 );
     rect(0, 0, width, height);
     noStroke();
}

float getWormX(int i) {
     return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
     return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}