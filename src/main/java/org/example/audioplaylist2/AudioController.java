package org.example.audioplaylist2;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
public class AudioController {

    String path = "src/main/resources/static/audios";
    File dir = new File(path);

    @PostMapping("/addSong")
    public void addSong(@RequestPart MultipartFile file) throws IOException {
        file.transferTo(dir);
    }

//    @GetMapping
//    public String getSongs() {
//
//    }
}
