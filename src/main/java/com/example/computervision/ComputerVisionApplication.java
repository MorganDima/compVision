package com.example.computervision;

import org.opencv.core.Mat;
import org.opencv.videoio.VideoCapture;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

@SpringBootApplication
public class ComputerVisionApplication {

    public static void main(String[] args) {

        JFrame window = new JFrame();
        JLabel screen = new JLabel();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

        VideoCapture cap = new VideoCapture(1);

        Mat frame = new Mat();

        SpringApplication.run(ComputerVisionApplication.class, args);
    }

}
