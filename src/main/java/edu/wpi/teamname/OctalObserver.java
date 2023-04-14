package edu.wpi.teamname;

import javafx.scene.control.Label;

public class OctalObserver extends Observer {
  Subject subject;
  Label label;

  public OctalObserver(Subject subject, Label label) {
    this.subject = subject;
    this.label = label;
    this.subject.attach(this);
  }

  @Override
  public void update() {
    label.setText("Octal: " + Integer.toOctalString(subject.getState()));
  }
}
