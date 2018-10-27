package com.epam.mentoring.codegen.api;

import com.epam.mentoring.codegen.model.ModelApiResponse;
import org.springframework.core.io.Resource;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-27T10:51:38.148+03:00")

@Controller
public class FileApiController implements FileApi {



    public ResponseEntity<Void> addFile(@ApiParam(value = "File object that needs to be added to the store" ,required=true )  @Valid @RequestBody java.io.File body) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteFile(@ApiParam(value = "File id to delete",required=true ) @PathVariable("fileId") Long fileId,
        @ApiParam(value = "" ) @RequestHeader(value="api_key", required=false) String apiKey) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<List<java.io.File>> findFilesByStatus( @NotNull@ApiParam(value = "Status values that need to be considered for filter", required = true, allowableValues = "available, pending, outdated") @RequestParam(value = "status", required = true) List<String> status) {
        // do some magic!
        return new ResponseEntity<List<java.io.File>>(HttpStatus.OK);
    }

    public ResponseEntity<List<java.io.File>> findFilesByTags( @NotNull@ApiParam(value = "Tags to filter by", required = true) @RequestParam(value = "tags", required = true) List<String> tags) {
        // do some magic!
        return new ResponseEntity<List<java.io.File>>(HttpStatus.OK);
    }

    public ResponseEntity<java.io.File> getFileById(@ApiParam(value = "ID of file to return",required=true ) @PathVariable("fileId") Long fileId) {
        // do some magic!
        return new ResponseEntity<java.io.File>(HttpStatus.OK);
    }

    public ResponseEntity<Void> updateFile(@ApiParam(value = "File object that needs to be added to the store" ,required=true )  @Valid @RequestBody java.io.File body) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> updateFileWithForm(@ApiParam(value = "ID of file that needs to be updated",required=true ) @PathVariable("fileId") Long fileId,
        @ApiParam(value = "Updated name of the file") @RequestPart(value="name", required=false)  String name,
        @ApiParam(value = "Updated status of the file") @RequestPart(value="status", required=false)  String status) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<ModelApiResponse> uploadFile(@ApiParam(value = "ID of file to update",required=true ) @PathVariable("fileId") Long fileId,
        @ApiParam(value = "Additional data to pass to server") @RequestPart(value="additionalMetadata", required=false)  String additionalMetadata,
        @ApiParam(value = "file detail") @RequestPart("file") MultipartFile file) {
        // do some magic!
        return new ResponseEntity<ModelApiResponse>(HttpStatus.OK);
    }

}
