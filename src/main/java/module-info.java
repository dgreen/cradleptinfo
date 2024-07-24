module net.gwizlabs.cradleptinfo {
  requires javafx.controls;
  requires javafx.fxml;
  requires java.compiler;
  requires com.fasterxml.jackson.databind;
  requires com.fasterxml.jackson.core;
  requires java.net.http;
  requires com.fasterxml.jackson.annotation;

  opens net.gwizlabs.cradleptinfo to
      javafx.fxml;

  exports net.gwizlabs.cradleptinfo;
}
