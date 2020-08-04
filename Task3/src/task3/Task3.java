package task3;

import java.io.FileInputStream;
import java.text.DecimalFormat;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Task3 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Smartpad App");
        
    //Lighting Area/PANE ----------------------------------------------------------------------------------
        Pane lighting = new Pane();
        lighting.setStyle("-fx-background-color: WHITE; -fx-border-color:black; -fx-border-radius: 5; -fx-background-radius: 5;");
        lighting.setPrefSize(320, 250);
        lighting.setPadding(new Insets(5, 5, 5, 5));

        Label lightlabl = new Label("Lighting:");
        lightlabl.setPadding(new Insets(5));
        lightlabl.setStyle("-fx-font-weight: bold");

        HBox h0 = new HBox();
        h0.getChildren().add(lightlabl);

        //HALL HBOX
        Label homelabel = new Label("Hall:");
        homelabel.setFont(Font.font("Cambria", 13));
      
        //Hall Slider
        Slider s = new Slider();
        s.setMin(1);
        s.setMax(10);
        s.setValue(5);
        s.setBlockIncrement(1);
        Circle circle = new Circle(10, javafx.scene.paint.Color.web("#669966"));  
        s.valueProperty().addListener(new ChangeListener<Number>() {
             public void changed(
                    ObservableValue<? extends Number> observableValue,
                    Number oldValue,
                    Number newValue) {
                if (newValue.intValue() == 1) {
                    circle.setFill(javafx.scene.paint.Color.web("#CCFFCC"));
                } else if (newValue.intValue() == 3) {
                    circle.setFill(javafx.scene.paint.Color.web("#99CC99"));

                } else if (newValue.intValue() == 2) {
                    circle.setFill(javafx.scene.paint.Color.web("#B3E6B3"));
                } else if (newValue.intValue() == 4) {
                    circle.setFill(javafx.scene.paint.Color.web("#B3E6B3"));
                } else if (newValue.intValue() == 6) {
                    circle.setFill(javafx.scene.paint.Color.web("#4D804D"));
                } else if (newValue.intValue() == 7) {
                    circle.setFill(javafx.scene.paint.Color.web("#336633"));
                } else if (newValue.intValue() == 10) {
                    circle.setFill(javafx.scene.paint.Color.web("#1A4D1A"));
                } else if (newValue.intValue() == 9) {
                    circle.setFill(javafx.scene.paint.Color.web("#336633"));
                } else if (newValue.intValue() == 8) {
                    circle.setFill(javafx.scene.paint.Color.web("#4D804D"));
                }

            }
        });

        HBox h1 = new HBox(5);
        h1.setSpacing(10);
        h1.setPrefWidth(300);
        h1.setPadding(new Insets(0, 10, 0, 5));
        h1.getChildren().addAll(homelabel, s, circle);
        h1.setAlignment(Pos.BASELINE_RIGHT);

        //KITCHEN Hbox
        Label kitchenlabel = new Label("Kitchen:");
        homelabel.setFont(Font.font("Cambria", 13));
        
        //Kitchen Slider
        Slider s1 = new Slider();
        s1.setMin(1);
        s1.setMax(10);
        s1.setValue(5);
        Circle circle1 = new Circle(10, javafx.scene.paint.Color.web("#669966"));
        s1.valueProperty().addListener(new ChangeListener<Number>() {
            
            public void changed(
                    ObservableValue<? extends Number> observableValue,
                    Number oldValue,
                    Number newValue) {
                if (newValue.intValue() == 1) {
                    circle1.setFill(javafx.scene.paint.Color.web("#CCFFCC"));
                } else if (newValue.intValue() == 3) {
                    circle1.setFill(javafx.scene.paint.Color.web("#99CC99"));

                } else if (newValue.intValue() == 2) {
                    circle1.setFill(javafx.scene.paint.Color.web("#B3E6B3"));
                } else if (newValue.intValue() == 4) {
                    circle1.setFill(javafx.scene.paint.Color.web("#B3E6B3"));
                } else if (newValue.intValue() == 6) {
                    circle1.setFill(javafx.scene.paint.Color.web("#4D804D"));
                } else if (newValue.intValue() == 7) {
                    circle1.setFill(javafx.scene.paint.Color.web("#336633"));
                } else if (newValue.intValue() == 10) {
                    circle1.setFill(javafx.scene.paint.Color.web("#1A4D1A"));
                } else if (newValue.intValue() == 9) {
                    circle1.setFill(javafx.scene.paint.Color.web("#336633"));
                } else if (newValue.intValue() == 8) {
                    circle1.setFill(javafx.scene.paint.Color.web("#4D804D"));
                }

            }
        });

        HBox h2 = new HBox(5);
        h2.setSpacing(10);
        h2.setPrefWidth(300);
        h2.setPadding(new Insets(0, 10, 0, 10));
        h2.getChildren().addAll(kitchenlabel, s1, circle1);
        h2.setAlignment(Pos.BASELINE_RIGHT);

        //Dining Room Hbox 
        Label Dininglabel = new Label("Dining Room:");
        homelabel.setFont(Font.font("Cambria", 13));
       
        //Dinining Room Slider
        Slider s2 = new Slider();
        s2.setMin(1);
        s2.setMax(10);
        s2.setValue(5);
        Circle circle2 = new Circle(10, javafx.scene.paint.Color.web("#669966"));
        s2.valueProperty().addListener(new ChangeListener<Number>() {

            public void changed(
                    ObservableValue<? extends Number> observableValue,
                    Number oldValue,
                    Number newValue) {
                if (newValue.intValue() == 1) {
                    circle2.setFill(javafx.scene.paint.Color.web("#CCFFCC"));
                } else if (newValue.intValue() == 3) {
                    circle2.setFill(javafx.scene.paint.Color.web("#99CC99"));

                } else if (newValue.intValue() == 2) {
                    circle2.setFill(javafx.scene.paint.Color.web("#B3E6B3"));
                } else if (newValue.intValue() == 4) {
                    circle2.setFill(javafx.scene.paint.Color.web("#B3E6B3"));
                } else if (newValue.intValue() == 6) {
                    circle2.setFill(javafx.scene.paint.Color.web("#4D804D"));
                } else if (newValue.intValue() == 7) {
                    circle2.setFill(javafx.scene.paint.Color.web("#336633"));
                } else if (newValue.intValue() == 10) {
                    circle2.setFill(javafx.scene.paint.Color.web("#1A4D1A"));
                } else if (newValue.intValue() == 9) {
                    circle2.setFill(javafx.scene.paint.Color.web("#336633"));
                } else if (newValue.intValue() == 8) {
                    circle2.setFill(javafx.scene.paint.Color.web("#4D804D"));
                }

            }
        });

        HBox h3 = new HBox(5);
        h3.setSpacing(10);
        h3.setPrefWidth(300);
        h3.setPadding(new Insets(0, 10, 0, 5));
        h3.getChildren().addAll(Dininglabel, s2, circle2);
        h3.setAlignment(Pos.BASELINE_RIGHT);

        //Living Room Hbox
        Label livinglabel = new Label("Living Room:");
        homelabel.setFont(Font.font("Cambria", 13));
        
        //Living Room Slider
        Slider s3 = new Slider();
        s3.setMin(1);
        s3.setMax(10);
        s3.setValue(5);
        Circle circle3 = new Circle(10, javafx.scene.paint.Color.web("#669966"));
        s3.valueProperty().addListener(new ChangeListener<Number>() {
            
            public void changed(
                    ObservableValue<? extends Number> observableValue,
                    Number oldValue,
                    Number newValue) {
                if (newValue.intValue() == 1) {
                    circle3.setFill(javafx.scene.paint.Color.web("#CCFFCC"));
                } else if (newValue.intValue() == 3) {
                    circle3.setFill(javafx.scene.paint.Color.web("#99CC99"));

                } else if (newValue.intValue() == 2) {
                    circle3.setFill(javafx.scene.paint.Color.web("#B3E6B3"));
                } else if (newValue.intValue() == 4) {
                    circle3.setFill(javafx.scene.paint.Color.web("#B3E6B3"));
                } else if (newValue.intValue() == 6) {
                    circle3.setFill(javafx.scene.paint.Color.web("#4D804D"));
                } else if (newValue.intValue() == 7) {
                    circle3.setFill(javafx.scene.paint.Color.web("#336633"));
                } else if (newValue.intValue() == 10) {
                    circle3.setFill(javafx.scene.paint.Color.web("#1A4D1A"));
                } else if (newValue.intValue() == 9) {
                    circle3.setFill(javafx.scene.paint.Color.web("#336633"));
                } else if (newValue.intValue() == 8) {
                    circle3.setFill(javafx.scene.paint.Color.web("#4D804D"));
                }

            }
        });
        HBox h4 = new HBox(5);
        h4.setSpacing(10);
        h4.setPrefWidth(300);
        h4.setPadding(new Insets(0, 10, 0, 5));
        h4.setAlignment(Pos.BASELINE_RIGHT);
        h4.getChildren().addAll(livinglabel, s3, circle3);

        //Landing Hbox
        Label landinlabel = new Label("Landing:");
        homelabel.setFont(Font.font("Cambria", 13));
        
//Landing Slider
        Slider s4 = new Slider();
        s4.setMin(1);
        s4.setMax(10);
        s4.setValue(5);
        Circle circle4 = new Circle(10, javafx.scene.paint.Color.web("#669966"));
        s4.valueProperty().addListener(new ChangeListener<Number>() {
        
            public void changed(
                    ObservableValue<? extends Number> observableValue,
                    Number oldValue,
                    Number newValue) {
                if (newValue.intValue() == 1) {
                    circle4.setFill(javafx.scene.paint.Color.web("#CCFFCC"));
                } else if (newValue.intValue() == 3) {
                    circle4.setFill(javafx.scene.paint.Color.web("#99CC99"));

                } else if (newValue.intValue() == 2) {
                    circle4.setFill(javafx.scene.paint.Color.web("#B3E6B3"));
                } else if (newValue.intValue() == 4) {
                    circle4.setFill(javafx.scene.paint.Color.web("#B3E6B3"));
                } else if (newValue.intValue() == 6) {
                    circle4.setFill(javafx.scene.paint.Color.web("#4D804D"));
                } else if (newValue.intValue() == 7) {
                    circle4.setFill(javafx.scene.paint.Color.web("#336633"));
                } else if (newValue.intValue() == 10) {
                    circle4.setFill(javafx.scene.paint.Color.web("#1A4D1A"));
                } else if (newValue.intValue() == 9) {
                    circle4.setFill(javafx.scene.paint.Color.web("#336633"));
                } else if (newValue.intValue() == 8) {
                    circle4.setFill(javafx.scene.paint.Color.web("#4D804D"));
                }

            }
        });
        HBox h5 = new HBox(5);
        h5.setSpacing(10);
        h5.setPrefWidth(300);
        h5.setPadding(new Insets(0, 10, 0, 5));
        h5.setAlignment(Pos.BASELINE_RIGHT);
        h5.getChildren().addAll(landinlabel, s4, circle4);

        //Bedroom 1 Hbox
        Label bedroom1label = new Label("Bedroom 1:");
        homelabel.setFont(Font.font("Cambria", 13));
        
        //Bedroom 1 Slider
        Slider s5 = new Slider();
        s5.setMin(1);
        s5.setMax(10);
        s5.setValue(5);
        Circle circle5 = new Circle(10, javafx.scene.paint.Color.web("#669966"));
        s5.valueProperty().addListener(new ChangeListener<Number>() {
            
            public void changed(
                    ObservableValue<? extends Number> observableValue,
                    Number oldValue,
                    Number newValue) {
                if (newValue.intValue() == 1) {
                    circle5.setFill(javafx.scene.paint.Color.web("#CCFFCC"));
                } else if (newValue.intValue() == 3) {
                    circle5.setFill(javafx.scene.paint.Color.web("#99CC99"));

                } else if (newValue.intValue() == 2) {
                    circle5.setFill(javafx.scene.paint.Color.web("#B3E6B3"));
                } else if (newValue.intValue() == 4) {
                    circle5.setFill(javafx.scene.paint.Color.web("#B3E6B3"));
                } else if (newValue.intValue() == 6) {
                    circle5.setFill(javafx.scene.paint.Color.web("#4D804D"));
                } else if (newValue.intValue() == 7) {
                    circle5.setFill(javafx.scene.paint.Color.web("#336633"));
                } else if (newValue.intValue() == 10) {
                    circle5.setFill(javafx.scene.paint.Color.web("#1A4D1A"));
                } else if (newValue.intValue() == 9) {
                    circle5.setFill(javafx.scene.paint.Color.web("#336633"));
                } else if (newValue.intValue() == 8) {
                    circle5.setFill(javafx.scene.paint.Color.web("#4D804D"));
                }

            }
        });
        HBox h6 = new HBox(5);
        h6.setSpacing(10);
        h6.setPrefWidth(300);
        h6.setPadding(new Insets(0, 10, 0, 5));
        h6.setAlignment(Pos.BASELINE_RIGHT);
        h6.getChildren().addAll(bedroom1label, s5, circle5);

        //Bedroom 2 Hbox
        Label bedroom2label = new Label("Bedroom 2:");
        homelabel.setFont(Font.font("Cambria", 13));
        
        //Bedroom 2 Slider
        Slider s6 = new Slider();
        s6.setMin(1);
        s6.setMax(10);
        s6.setValue(5);
        Circle circle6 = new Circle(10, javafx.scene.paint.Color.web("#669966"));
        s6.valueProperty().addListener(new ChangeListener<Number>() {
        
            public void changed(
                    ObservableValue<? extends Number> observableValue,
                    Number oldValue,
                    Number newValue) {
                if (newValue.intValue() == 1) {
                    circle6.setFill(javafx.scene.paint.Color.web("#CCFFCC"));
                } else if (newValue.intValue() == 3) {
                    circle6.setFill(javafx.scene.paint.Color.web("#99CC99"));

                } else if (newValue.intValue() == 2) {
                    circle6.setFill(javafx.scene.paint.Color.web("#B3E6B3"));
                } else if (newValue.intValue() == 4) {
                    circle6.setFill(javafx.scene.paint.Color.web("#B3E6B3"));
                } else if (newValue.intValue() == 6) {
                    circle6.setFill(javafx.scene.paint.Color.web("#4D804D"));
                } else if (newValue.intValue() == 7) {
                    circle6.setFill(javafx.scene.paint.Color.web("#336633"));
                } else if (newValue.intValue() == 10) {
                    circle6.setFill(javafx.scene.paint.Color.web("#1A4D1A"));
                } else if (newValue.intValue() == 9) {
                    circle6.setFill(javafx.scene.paint.Color.web("#336633"));
                } else if (newValue.intValue() == 8) {
                    circle6.setFill(javafx.scene.paint.Color.web("#4D804D"));
                }

            }
        });
        HBox h7 = new HBox(5);
        h7.setSpacing(10);
        h7.setPrefWidth(300);
        h7.setPadding(new Insets(5, 10, 5, 10));
        h7.setAlignment(Pos.BASELINE_RIGHT);
        h7.getChildren().addAll(bedroom2label, s6, circle6);

        VBox vb = new VBox(5);
        vb.getChildren().addAll(h0, h1, h2, h3, h4, h5, h6, h7);
        vb.setPadding(new Insets(5, 5, 5, 5));
        lighting.getChildren().addAll(vb);

    //Central Heating Area/PANE --------------------------------------------------------------------------
        Pane heating = new Pane();
        heating.setStyle("-fx-background-color: WHITE; -fx-border-color:black; -fx-border-radius: 5; -fx-background-radius: 5;");
        heating.setPrefSize(300, 200);
       
        Label heatlabl = new Label("Central Heating:");
        heatlabl.setPadding(new Insets(5,5,0,5));
        heatlabl.setStyle("-fx-font-weight: bold");

        HBox heath0 = new HBox();
        heath0.getChildren().add(heatlabl);

        RadioButton radioButton1 = new RadioButton("Off");
        RadioButton radioButton2 = new RadioButton("Auto");
        RadioButton radioButton3 = new RadioButton("Once");
        RadioButton radioButton4 = new RadioButton("Count");
        radioButton2.setSelected(true);
        ToggleGroup radioGroup = new ToggleGroup();

        radioButton1.setToggleGroup(radioGroup);
        radioButton2.setToggleGroup(radioGroup);
        radioButton3.setToggleGroup(radioGroup);
        radioButton4.setToggleGroup(radioGroup);

        VBox heatvb = new VBox(5);
        heatvb.setSpacing(30);
        heatvb.getChildren().addAll(radioButton1, radioButton2, radioButton3, radioButton4);

        //Text field
        TextField tf = new TextField();
        tf.setPrefWidth(60);
        tf.setPrefHeight(40);

        tf.setBorder((new Border(new BorderStroke(javafx.scene.paint.Color.BLACK,
                BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT))));

        //slider
        Slider temp = new Slider(0, 30, 20);
        temp.setOrientation(Orientation.VERTICAL);
        temp.setShowTickMarks(true);
        temp.setShowTickLabels(true);
        temp.setMajorTickUnit(5.0f);
        temp.setBlockIncrement(0.1f);
        temp.setStyle("-fx-font-weight: bold;");
        
        tf.setText(String.valueOf(temp.getValue()));
        temp.valueProperty().addListener(new ChangeListener<Number>() {
            public void changed(
                    ObservableValue<? extends Number> observableValue,
                    Number oldValue,
                    Number newValue) {
                tf.setText(String.valueOf(new DecimalFormat("##.#").format(newValue)));
            }
        });

        HBox heathb = new HBox();
        heathb.setPadding(new Insets(10));
        heathb.setSpacing(40l);
        heathb.getChildren().addAll(heatvb, temp, tf);
        heathb.setAlignment(Pos.CENTER);

        VBox heatvb2 = new VBox();
        heatvb2.getChildren().addAll(heath0, heathb);

        heating.getChildren().addAll(heatvb2);

        //Grid pane 
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(0, 27, 0, 5));
        grid.setHgap(15);
        grid.setVgap(25);

        grid.setConstraints(lighting, 0, 0);
        grid.setConstraints(heating, 0, 1);
        grid.getChildren().addAll(lighting, heating);

//CCTV Area/PANE --------------------------------------------------------------------------
        Pane cctv = new Pane();
        cctv.setStyle("-fx-background-color: WHITE; -fx-border-color:black; -fx-border-radius: 5; -fx-background-radius: 5;");
        cctv.setPrefSize(500, 200);
        
        Label cctvlabl = new Label("CCTV:");
        cctvlabl.setPadding(new Insets(-25));
        cctvlabl.setStyle("-fx-font-weight: bold");

        HBox cctvh0 = new HBox();
        cctvh0.setPadding(new Insets(30));
        cctvh0.getChildren().add(cctvlabl);

        Image img = new Image(new FileInputStream("images/front.jpg"));
        ImageView iv1 = new ImageView();
        iv1.setImage(img);
        iv1.setFitWidth(230);
        iv1.setFitHeight(400);
        iv1.setPreserveRatio(true);
        iv1.setSmooth(true);
        iv1.setCache(true);
        iv1.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0,0,0,0.8), 10, 0, 0, 0);");

        Image img2 = new Image(new FileInputStream("images/back.jpg"));
        ImageView iv2 = new ImageView();
        iv2.setImage(img2);
        iv2.setFitWidth(230);
        iv2.setFitHeight(400);
        iv2.setPreserveRatio(true);
        iv2.setSmooth(true);
        iv2.setCache(true);
        iv2.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0,0,0,0.8), 10, 0, 0, 0);");

        HBox imghbox = new HBox(5);
        imghbox.setSpacing(10);
        imghbox.setPrefWidth(480);
        imghbox.setAlignment(Pos.CENTER);
        imghbox.getChildren().addAll(iv1, iv2);

        //hb2        
        Image img3 = new Image(new FileInputStream("images/side.jpg"));
        ImageView iv3 = new ImageView();
        iv3.setImage(img3);
        iv3.setFitWidth(230);
        iv3.setFitHeight(400);

        iv3.setPreserveRatio(true);
        iv3.setSmooth(true);
        iv3.setCache(true);
        iv3.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0,0,0,0.8), 10, 0, 0, 0);");

        Image img4 = new Image(new FileInputStream("images/drive.jpg"));
        ImageView iv4 = new ImageView();
        iv4.setImage(img4);
        iv4.setFitWidth(230);
        iv4.setFitHeight(400);
        iv4.setPreserveRatio(true);
        iv4.setSmooth(true);
        iv4.setCache(true);
        iv4.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0,0,0,0.8), 10, 0, 0, 0);");

        HBox imghbox2 = new HBox(5);
        imghbox2.setSpacing(5);
        imghbox2.setAlignment(Pos.CENTER);
        imghbox2.getChildren().addAll(iv3, iv4);
       // imghbox2.setStyle("-fx-border-color: red");

        //Mute Button HBOX 
        Image black = new Image(new FileInputStream("images/mute-screen.gif"));
        Button frontbtn = new Button("Front");

        frontbtn.setOnAction(new EventHandler<ActionEvent>() {
            int frcount = 0;

            @Override
            public void handle(ActionEvent e) {
                frcount = frcount + 1;
                if (frcount % 2 == 0) {
                    iv1.setImage(img);
                } else {
                    iv1.setImage(black);
                }

            }
        });
        Button rearbtn = new Button("Rear");
        rearbtn.setOnAction(new EventHandler<ActionEvent>() {
            int frcount = 0;

            @Override
            public void handle(ActionEvent e) {
                frcount = frcount + 1;
                if (frcount % 2 == 0) {
                    iv2.setImage(img2);
                } else {
                    iv2.setImage(black);
                }

            }
        });
        Button sidebtn = new Button("Side");
        sidebtn.setOnAction(new EventHandler<ActionEvent>() {
            int frcount = 0;

            @Override
            public void handle(ActionEvent e) {
                frcount = frcount + 1;
                if (frcount % 2 == 0) {
                    iv3.setImage(img3);
                } else {
                    iv3.setImage(black);
                }

            }
        });

        Button drivebtn = new Button("Drive");
        drivebtn.setOnAction(new EventHandler<ActionEvent>() {
            int frcount = 0;

            @Override
            public void handle(ActionEvent e) {
                frcount = frcount + 1;
                if (frcount % 2 == 0) {
                    iv4.setImage(img4);
                } else {
                    iv4.setImage(black);
                }

            }
        });

        HBox btnhbox = new HBox(5);
        btnhbox.setSpacing(15);
        btnhbox.setPadding(new Insets(10,10,10,10));
        btnhbox.getChildren().addAll(frontbtn, rearbtn, sidebtn, drivebtn);
        btnhbox.setAlignment(Pos.CENTER);
        
        VBox cctvvb = new VBox(10);
        cctvvb.setSpacing(5);
        cctvvb.setPadding(new Insets(5, 5, 5, 5));
        cctvvb.setAlignment(Pos.CENTER);
        cctvvb.getChildren().addAll(cctvh0, imghbox, imghbox2, btnhbox);
        cctv.getChildren().addAll(cctvvb);

        BorderPane border = new BorderPane();
        border.setLeft(grid);
        border.setCenter(cctv);
        border.setPadding(new Insets(10, 15, 10, 10));

        Scene sceneTaskThree = new Scene(border, 857, 475);
        primaryStage.setScene(sceneTaskThree);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
