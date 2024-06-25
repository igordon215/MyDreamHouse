
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ,
 * converted for use with Replit
 * 
 * @author Michael Kölling and David J. Barnes
 * @version 1.1 (24 May 2001)
 */
public class Picture {
  private Square wall;
  private Square wall1;
  private Square ocean;
  private Square pillar;
  private Square pillar1;
  private Square pillar2;
  private Square pillar3;
  private Square pillar4;
  private Square pillar5;
  private Circle window;
  private Circle window1;
  private Triangle roof;
  private Circle sun;
  private Circle sky;
  private Circle cloud;
  private Circle cloud1;
  private Circle cloud2;
  private Circle cloud3;
  private Square pontTop;
  private Square pontTop1;
  private Square pontTop2;
  private Square pontTop3;
  private Circle pont;
  private Circle pont1;
  private Circle pont2;
  private Circle pont3;
  private Circle pont4;

  /**
   * Constructor for objects of class Picture
   */
  public Picture() {
    // nothing to do... instance variables are automatically set to null
  }

  /**
   * Draw this picture.
   */
  public void draw() {
       
    sun = new Circle();
    sun.changeColor("yellow");
    sun.moveHorizontal(180);
    sun.moveVertical(-10);
    sun.changeSize(180);
    sun.makeVisible();

    sky = new Circle();
    sky.changeColor("light_gray");
    sky.moveHorizontal(200);
    sky.moveVertical(50);
    sky.changeSize(180);
    sky.makeVisible();

    cloud = new Circle();
    cloud.changeColor("white");
    cloud.moveHorizontal(130);
    cloud.moveVertical(-10);
    cloud.changeSize(70);
    cloud.makeVisible();
    
    cloud1 = new Circle();
    cloud1.changeColor("white");
    cloud1.moveHorizontal(180);
    cloud1.moveVertical(-10);
    cloud1.changeSize(60);
    cloud1.makeVisible();

    cloud2 = new Circle();
    cloud2.changeColor("white");
    cloud2.moveHorizontal(180);
    cloud2.moveVertical(20);
    cloud2.changeSize(60);
    cloud2.makeVisible();

    cloud3 = new Circle();
    cloud3.changeColor("white");
    cloud3.moveHorizontal(130);
    cloud3.moveVertical(40);
    cloud3.changeSize(60);
    cloud3.makeVisible();
    
    wall = new Square();
    wall.moveVertical(90);
    wall.changeSize(70);
    wall.moveHorizontal(0);
    wall.makeVisible();
    wall.changeColor("pink");

    wall1 = new Square();
    wall1.moveVertical(90);
    wall1.changeSize(70);
    wall1.moveHorizontal(65);
    wall1.makeVisible();
    wall1.changeColor("pink");

    window = new Circle();
    window.changeColor("white");
    window.moveHorizontal(180);
    window.moveVertical(155);
    window.changeSize(25);
    window.makeVisible();

    window1 = new Circle();
    window1.changeColor("white");
    window1.moveHorizontal(250);
    window1.moveVertical(155);
    window1.changeSize(25);
    window1.makeVisible();

    ocean = new Square();
    ocean.moveVertical(80);
    ocean.changeSize(300);
    ocean.moveHorizontal(-60);
    ocean.moveVertical(90);
    ocean.makeVisible();
    ocean.changeColor("blue");

    pillar = new Square();
    pillar.changeColor("pink");
    pillar.changeSize(20);
    pillar.moveHorizontal(0);
    pillar.moveVertical(70);
    pillar.makeVisible();

    pillar1 = new Square();
    pillar1.changeColor("pink");
    pillar1.changeSize(20);
    pillar1.moveHorizontal(0);
    pillar1.moveVertical(50);
    pillar1.makeVisible();

    pillar2 = new Square();
    pillar2.changeColor("pink");
    pillar2.changeSize(20);
    pillar2.moveHorizontal(55);
    pillar2.moveVertical(50);
    pillar2.makeVisible();

    pillar3 = new Square();
    pillar3.changeColor("pink");
    pillar3.changeSize(20);
    pillar3.moveHorizontal(55);
    pillar3.moveVertical(70);
    pillar3.makeVisible();

    pillar5 = new Square();
    pillar5.changeColor("pink");
    pillar5.changeSize(20);
    pillar5.moveHorizontal(115);
    pillar5.moveVertical(70);
    pillar5.makeVisible();

    pillar4 = new Square();
    pillar4.changeColor("pink");
    pillar4.changeSize(20);
    pillar4.moveHorizontal(115);
    pillar4.moveVertical(50);
    pillar4.makeVisible();

    

    roof = new Triangle();
    roof.changeColor("red");
    roof.changeSize(20, 190);
    roof.moveHorizontal(75);
    roof.moveVertical(70);
    roof.makeVisible();

   

    pont = new Circle();
    pont.changeColor("black");
    pont.moveHorizontal(150);
    pont.moveVertical(200);
    pont.changeSize(35);
    pont.makeVisible();

    pont1 = new Circle();
    pont1.changeColor("black");
    pont1.moveHorizontal(180);
    pont1.moveVertical(200);
    pont1.changeSize(35);
    pont1.makeVisible();

    pont2 = new Circle();
    pont2.changeColor("black");
    pont2.moveHorizontal(210);
    pont2.moveVertical(200);
    pont2.changeSize(35);
    pont2.makeVisible();

    pont3 = new Circle();
    pont3.changeColor("black");
    pont3.moveHorizontal(240);
    pont3.moveVertical(200);
    pont3.changeSize(35);
    pont3.makeVisible();

    pont4 = new Circle();
    pont4.changeColor("black");
    pont4.moveHorizontal(270);
    pont4.moveVertical(200);
    pont4.changeSize(35);
    pont4.makeVisible();

    pontTop = new Square();
    pontTop.changeSize(30);
    pontTop.moveHorizontal(10);
    pontTop.moveVertical(150);
    pontTop.makeVisible();
    pontTop.changeColor("black");
   
    pontTop1 = new Square();
    pontTop1.changeSize(30);
    pontTop1.moveHorizontal(40);
    pontTop1.moveVertical(150);
    pontTop1.makeVisible();
    pontTop1.changeColor("black");

    pontTop2 = new Square();
    pontTop2.changeSize(30);
    pontTop2.moveHorizontal(70);
    pontTop2.moveVertical(150);
    pontTop2.makeVisible();
    pontTop2.changeColor("black");

    pontTop3 = new Square();
    pontTop3.changeSize(30);
    pontTop3.moveHorizontal(100);
    pontTop3.moveVertical(150);
    pontTop3.makeVisible();
    pontTop3.changeColor("black");

    
  }

  /**
   * Change this picture to black/white display
   */
  public void setBlackAndWhite() {
    if (wall != null) // only if it's painted already...
    {
      wall.changeColor("black");
      window.changeColor("white");
      roof.changeColor("black");
      sun.changeColor("black");
    }
  }

  /**
   * Change this picture to use color display
   */
  public void setColor() {
    if (wall != null) // only if it's painted already...
    {
      wall.changeColor("red");
      window.changeColor("black");
      roof.changeColor("red");
      sun.changeColor("yellow");
    }
  }

}