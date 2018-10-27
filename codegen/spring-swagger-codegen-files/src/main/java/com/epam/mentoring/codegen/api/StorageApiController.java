package com.epam.mentoring.codegen.api;

import com.epam.mentoring.codegen.model.Load;
import java.util.Map;

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
public class StorageApiController implements StorageApi {



    public ResponseEntity<Void> deleteLoad( @Min(1)@ApiParam(value = "ID of the load that needs to be deleted",required=true ) @PathVariable("loadId") Long loadId) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Load> getLoadById( @Min(1) @Max(10)@ApiParam(value = "ID of file that needs to be fetched",required=true ) @PathVariable("loadId") Long loadId) {
        // do some magic!
        return new ResponseEntity<Load>(HttpStatus.OK);
    }

    public ResponseEntity<Map<String, Integer>> getOptions() {
        // do some magic!
        return new ResponseEntity<Map<String, Integer>>(HttpStatus.OK);
    }

    public ResponseEntity<Load> load(@ApiParam(value = "load a file" ,required=true )  @Valid @RequestBody Load body) {
        // do some magic!
        return new ResponseEntity<Load>(HttpStatus.OK);
    }

}
