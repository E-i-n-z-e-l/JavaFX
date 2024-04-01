import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.text.Text;

public class Main extends Application {

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage stage) {

        // установка надписи
        Text text = new Text("--add-modules javafx.controls,javafx.fxml \"-javaagent:E:\\1\\Учеба\\IntelliJ IDEA " +
                "Community Edition 2023.1\\lib\\idea_rt.jar=55439:E:\\1\\Учеба\\IntelliJ IDEA Community Edition 2023.1\\" +
                "bin\" -Dfile.encoding=UTF-8 -classpath E:\\1\\Diploma\\DiplomJavaFX\\target\\classes;E:\\1\\Diploma\\" +
                "javafx-sdk-17.0.10\\lib\\javafx-swt.jar;E:\\1\\Diploma\\javafx-sdk-17.0.10\\lib\\javafx.web.jar;E:\\1\\" +
                "Diploma\\javafx-sdk-17.0.10\\lib\\javafx.base.jar;E:\\1\\Diploma\\javafx-sdk-17.0.10\\lib\\javafx.fxml." +
                "jar;E:\\1\\Diploma\\javafx-sdk-17.0.10\\lib\\javafx.media.jar;E:\\1\\Diploma\\javafx-sdk-17.0!");
        text.setLayoutY(80);    // установка положения надписи по оси Y
        text.setLayoutX(80);   // установка положения надписи по оси X

        Group group = new Group(text);

        Scene scene = new Scene(group);
        stage.setScene(scene);
        stage.setTitle("JavaFX Application");
        stage.setWidth(300);
        stage.setHeight(250);
        stage.show();
    }
}
