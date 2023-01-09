//q1

import java.applet.Applet;
import java.awt.*;

public class CircleSquareApplet extends Applet {
  public void paint(Graphics g) {
    // Draw the square and fill it with red
    g.setColor(Color.red);
    g.fillRect(50, 50, 200, 200);

    // Draw the circle and fill it with blue
    g.setColor(Color.blue);
    g.fillOval(75, 75, 150, 150);

    // Set the font to MS Outlook, bold, and italic
    g.setFont(new Font("MS Outlook", Font.BOLD | Font.ITALIC, 20));
    g.setColor(Color.green);

    // Draw the message in the center of the circle
    FontMetrics fm = g.getFontMetrics();
    int messageWidth = fm.stringWidth("D. G. Ruparel College");
    int messageHeight = fm.getHeight();
    g.drawString("D. G. Ruparel College", 125, 125 + messageHeight / 4);
  }
}



<html>
  <body>
    <applet code="CircleSquareApplet.class" width="300" height="300"></applet>
  </body>
</html>




//q2

import java.applet.Applet;
import java.awt.*;

public class SquaresApplet extends Applet {
  public void paint(Graphics g) {
    // Set the color to blue
    g.setColor(Color.blue);

    // Draw the squares using a loop
    for (int i = 0; i < 5; i++) {
      // Fill the first, third, and fifth squares with blue
      if (i % 2 == 0) {
        g.fillRect(50 + i * 50, 50, 50, 50);
      } else {
        g.drawRect(50 + i * 50, 50, 50, 50);
      }
    }
  }
}

<html>
  <body>
    <applet code="SquaresApplet.class" width="300" height="100"></applet>
  </body>
</html>
 

//q3

import java.applet.Applet;
import java.awt.*;

public class HutApplet extends Applet {
  public void paint(Graphics g) {
    // Draw the roof and fill it with red
    int[] xPoints = {100, 150, 200};
    int[] yPoints = {50, 10, 50};
    g.setColor(Color.red);
    g.fillPolygon(xPoints, yPoints, 3);

    // Draw the hut and fill it with pink
    g.setColor(Color.pink);
    g.fillRect(75, 50, 150, 150);

    // Draw the door and fill it with blue
    g.setColor(Color.blue);
    g.fillRect(125, 150, 50, 100);
  }
}

<html>
  <body>
    <applet code="HutApplet.class" width="300" height="300"></applet>
  </body>
</html>

//q4
import java.applet.Applet;
import java.awt.*;

public class ManApplet extends Applet {
  public void paint(Graphics g) {
    // Set the color to blue
    g.setColor(Color.blue);

    // Draw the body
    g.drawRect(100, 50, 100, 200);

    // Draw the head
    g.drawOval(75, 50, 150, 150);

    // Draw the eyes
    g.setColor(Color.gray);
    g.drawOval(100, 75, 25, 25);
    g.drawOval(175, 75, 25, 25);

    // Draw the mouth
    g.setColor(Color.red);
    g.drawOval(125, 125, 50, 50);
  }
}



<html>
  <body>
    <applet code="ManApplet.class" width="300" height="300"></applet>
  </body>
</html>
