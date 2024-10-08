package introse.group20.hms.webapi.controllers;

import introse.group20.hms.core.entities.Post;
import introse.group20.hms.webapi.DTOs.PostDTO.PostRequest;
import introse.group20.hms.webapi.DTOs.PostDTO.PostResponse;
import jakarta.validation.Valid;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@Validated
public class PostController {
//    @GetMapping("/posts")
//    public ResponseEntity<List<PostResponse>> getAllPost(){
//
//    }
//
//    @GetMapping(value = "/posts/doctor", name = "getByDoctor")
//    //route: /posts/doctor?doctorId=<id of doctor>
//    public ResponseEntity<List<PostResponse>> getPostOfDoctor(@RequestParam UUID doctorId){
//
//    }

//    @GetMapping(value = "/category", name = "getByCategory")
//        //route: /posts/category?categoryId=<if of category>
//    public ResponseEntity<List<PostResponse>> getPostOfCategory(@RequestParam UUID categoryId){
//
//    }
////
//    @GetMapping(value = "/{postId}", name = "getByPostId")
//    public ResponseEntity<PostResponse> getPostById(@PathVariable UUID postId){
//
//    }
//
//    @PostMapping
//    @Secured("DOCTOR")
//    public ResponseEntity<PostResponse> createPost(@Valid @RequestBody PostRequest postRequest){
//
//    }
//
//    @PutMapping("/{postId}")
//    @Secured("DOCTOR")
//    public ResponseEntity<HttpStatus> updatePost(@Valid @RequestBody PostRequest postRequest){
//
//    }
//
//    @DeleteMapping("/{postId}")
//    @Secured("DOCTOR")
//    public ResponseEntity<HttpStatus> deletePost(@PathVariable UUID postId) {
//
//    }
}
