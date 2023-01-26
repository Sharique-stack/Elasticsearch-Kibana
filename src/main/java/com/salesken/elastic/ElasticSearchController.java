package com.salesken.elastic;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
public class ElasticSearchController {

    private final ElasticSearchQuery elasticSearchQuery;

    public ElasticSearchController(ElasticSearchQuery elasticSearchQuery) {
        this.elasticSearchQuery = elasticSearchQuery;
    }

    @PostMapping("/createOrUpdateDocument")
    public ResponseEntity<Object> createOrUpdateDocument(@RequestBody Student student) throws IOException {
          String response = elasticSearchQuery.createDocument(student);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/getDocument")
    public ResponseEntity<Object> getDocumentById(@RequestParam String studentId) throws IOException {
       Student student =  elasticSearchQuery.getDocumentById(studentId);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @DeleteMapping("/deleteDocument")
    public ResponseEntity<Object> deleteDocumentById(@RequestParam String studentId) throws IOException {
        String response =  elasticSearchQuery.deleteDocumentById(studentId);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/searchDocument")
    public ResponseEntity<Object> searchAllDocument() throws IOException {
        List<Student> students = elasticSearchQuery.searchAllDocuments();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }
}
