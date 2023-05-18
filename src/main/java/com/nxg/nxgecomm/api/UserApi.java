/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.3.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.nxg.nxgecomm.api;

import com.nxg.nxgecomm.api.model.User;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-18T11:23:47.883065700+05:30[Asia/Calcutta]")

@Validated
@Api(value = "user", description = "the user API")
public interface UserApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /user : Getting all user details
     *
     * @return A list of all user details (status code 200)
     *         or Successful (status code 201)
     *         or Bad request input (status code 400)
     *         or Data not found (status code 404)
     *         or Invalid input (status code 500)
     *         or Bad Gatway (status code 502)
     */
    @ApiOperation(value = "Getting all user details", nickname = "userGet", notes = "", response = User.class, tags={ "User Information", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A list of all user details", response = User.class),
        @ApiResponse(code = 201, message = "Successful"),
        @ApiResponse(code = 400, message = "Bad request input"),
        @ApiResponse(code = 404, message = "Data not found"),
        @ApiResponse(code = 500, message = "Invalid input"),
        @ApiResponse(code = 502, message = "Bad Gatway") })
    @RequestMapping(value = "/user",
        produces = { "applicantion/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<User> _userGet() {
        return userGet();
    }

    // Override this method
    default  ResponseEntity<User> userGet() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf(""))) {
                    String exampleString = "";
                    ApiUtil.setExampleResponse(request, "", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /user : Adding a new User
     *
     * @param body user details that needs to be added (required)
     * @return Successful (status code 201)
     *         or Bad request input (status code 400)
     *         or Data not found (status code 404)
     *         or Invalid input (status code 500)
     *         or Bad Gatway (status code 502)
     */
    @ApiOperation(value = "Adding a new User", nickname = "userPost", notes = "", tags={ "User Information", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Successful"),
        @ApiResponse(code = 400, message = "Bad request input"),
        @ApiResponse(code = 404, message = "Data not found"),
        @ApiResponse(code = 500, message = "Invalid input"),
        @ApiResponse(code = 502, message = "Bad Gatway") })
    @RequestMapping(value = "/user",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> _userPost(@ApiParam(value = "user details that needs to be added" ,required=true )  @Valid @RequestBody User body) {
        return userPost(body);
    }

    // Override this method
    default  ResponseEntity<Void> userPost(User body) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /user/{user_id} : Getting user details by id
     *
     * @param userId  (required)
     * @return A list of a user details (status code 200)
     *         or Successful (status code 201)
     *         or Bad request input (status code 400)
     *         or Data not found (status code 404)
     *         or Invalid input (status code 500)
     *         or Bad Gatway (status code 502)
     */
    @ApiOperation(value = "Getting user details by id", nickname = "userUserIdGet", notes = "", response = User.class, tags={ "User Information", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A list of a user details", response = User.class),
        @ApiResponse(code = 201, message = "Successful"),
        @ApiResponse(code = 400, message = "Bad request input"),
        @ApiResponse(code = 404, message = "Data not found"),
        @ApiResponse(code = 500, message = "Invalid input"),
        @ApiResponse(code = 502, message = "Bad Gatway") })
    @RequestMapping(value = "/user/{user_id}",
        produces = { "applicantion/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<User> _userUserIdGet(@ApiParam(value = "",required=true) @PathVariable("user_id") Integer userId) {
        return userUserIdGet(userId);
    }

    // Override this method
    default  ResponseEntity<User> userUserIdGet(Integer userId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf(""))) {
                    String exampleString = "";
                    ApiUtil.setExampleResponse(request, "", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /user/{user_id} : Editing user details
     *
     * @param userId  (required)
     * @param body User details that need to be added (required)
     * @return A list of a user details (status code 200)
     *         or Successful (status code 201)
     *         or Bad request input (status code 400)
     *         or Data not found (status code 404)
     *         or Invalid input (status code 500)
     *         or Bad Gatway (status code 502)
     */
    @ApiOperation(value = "Editing user details", nickname = "userUserIdPut", notes = "", response = User.class, tags={ "User Information", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A list of a user details", response = User.class),
        @ApiResponse(code = 201, message = "Successful"),
        @ApiResponse(code = 400, message = "Bad request input"),
        @ApiResponse(code = 404, message = "Data not found"),
        @ApiResponse(code = 500, message = "Invalid input"),
        @ApiResponse(code = 502, message = "Bad Gatway") })
    @RequestMapping(value = "/user/{user_id}",
        produces = { "applicantion/json" }, 
        consumes = { "applicantion/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<User> _userUserIdPut(@ApiParam(value = "",required=true) @PathVariable("user_id") Integer userId,@ApiParam(value = "User details that need to be added" ,required=true )  @Valid @RequestBody User body) {
        return userUserIdPut(userId, body);
    }

    // Override this method
    default  ResponseEntity<User> userUserIdPut(Integer userId, User body) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf(""))) {
                    String exampleString = "";
                    ApiUtil.setExampleResponse(request, "", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
