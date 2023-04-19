/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.3.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.nxg.nxgecomm.api;

import com.nxg.nxgecomm.api.model.CustomerDetails;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-19T13:12:34.365793400+05:30[Asia/Calcutta]")

@Validated
@Api(value = "customer", description = "the customer API")
public interface CustomerApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /customer : Getting all customer details
     *
     * @return A list of all customer details (status code 200)
     *         or Successful (status code 201)
     *         or Bad request input (status code 400)
     *         or Data not found (status code 404)
     *         or Invalid input (status code 500)
     *         or Bad Gatway (status code 502)
     */
    @ApiOperation(value = "Getting all customer details", nickname = "customerGet", notes = "", response = CustomerDetails.class, tags={ "Customer Information", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A list of all customer details", response = CustomerDetails.class),
        @ApiResponse(code = 201, message = "Successful"),
        @ApiResponse(code = 400, message = "Bad request input"),
        @ApiResponse(code = 404, message = "Data not found"),
        @ApiResponse(code = 500, message = "Invalid input"),
        @ApiResponse(code = 502, message = "Bad Gatway") })
    @RequestMapping(value = "/customer",
        produces = { "applicantion/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<CustomerDetails> _customerGet() {
        return customerGet();
    }

    // Override this method
    default  ResponseEntity<CustomerDetails> customerGet() {
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
     * DELETE /customer/{id} : Delete a customer
     *
     * @param id  (required)
     * @return Successful (status code 201)
     *         or Bad request input (status code 400)
     *         or Data not found (status code 404)
     *         or Invalid input (status code 500)
     *         or Bad Gatway (status code 502)
     */
    @ApiOperation(value = "Delete a customer", nickname = "customerIdDelete", notes = "", tags={ "Customer Information", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Successful"),
        @ApiResponse(code = 400, message = "Bad request input"),
        @ApiResponse(code = 404, message = "Data not found"),
        @ApiResponse(code = 500, message = "Invalid input"),
        @ApiResponse(code = 502, message = "Bad Gatway") })
    @RequestMapping(value = "/customer/{id}",
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> _customerIdDelete(@ApiParam(value = "",required=true) @PathVariable("id") Integer id) {
        return customerIdDelete(id);
    }

    // Override this method
    default  ResponseEntity<Void> customerIdDelete(Integer id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /customer/{id} : Getting Customer details by id
     *
     * @param id  (required)
     * @return A list of a customer&#39;s details (status code 200)
     *         or Successful (status code 201)
     *         or Bad request input (status code 400)
     *         or Data not found (status code 404)
     *         or Invalid input (status code 500)
     *         or Bad Gatway (status code 502)
     */
    @ApiOperation(value = "Getting Customer details by id", nickname = "customerIdGet", notes = "", response = CustomerDetails.class, tags={ "Customer Information", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A list of a customer's details", response = CustomerDetails.class),
        @ApiResponse(code = 201, message = "Successful"),
        @ApiResponse(code = 400, message = "Bad request input"),
        @ApiResponse(code = 404, message = "Data not found"),
        @ApiResponse(code = 500, message = "Invalid input"),
        @ApiResponse(code = 502, message = "Bad Gatway") })
    @RequestMapping(value = "/customer/{id}",
        produces = { "applicantion/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<CustomerDetails> _customerIdGet(@ApiParam(value = "",required=true) @PathVariable("id") Integer id) {
        return customerIdGet(id);
    }

    // Override this method
    default  ResponseEntity<CustomerDetails> customerIdGet(Integer id) {
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
     * PUT /customer/{id} : Editing customer details
     *
     * @param id  (required)
     * @param body Customer details that need to be added (required)
     * @return A list of a customer&#39;s details (status code 200)
     *         or Successful (status code 201)
     *         or Bad request input (status code 400)
     *         or Data not found (status code 404)
     *         or Invalid input (status code 500)
     *         or Bad Gatway (status code 502)
     */
    @ApiOperation(value = "Editing customer details", nickname = "customerIdPut", notes = "", response = CustomerDetails.class, tags={ "Customer Information", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A list of a customer's details", response = CustomerDetails.class),
        @ApiResponse(code = 201, message = "Successful"),
        @ApiResponse(code = 400, message = "Bad request input"),
        @ApiResponse(code = 404, message = "Data not found"),
        @ApiResponse(code = 500, message = "Invalid input"),
        @ApiResponse(code = 502, message = "Bad Gatway") })
    @RequestMapping(value = "/customer/{id}",
        produces = { "applicantion/json" }, 
        consumes = { "applicantion/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<CustomerDetails> _customerIdPut(@ApiParam(value = "",required=true) @PathVariable("id") Integer id,@ApiParam(value = "Customer details that need to be added" ,required=true )  @Valid @RequestBody CustomerDetails body) {
        return customerIdPut(id, body);
    }

    // Override this method
    default  ResponseEntity<CustomerDetails> customerIdPut(Integer id, CustomerDetails body) {
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
     * POST /customer : Adding a new customer
     *
     * @param body customer details that needs to be added (required)
     * @return Successful (status code 201)
     *         or Bad request input (status code 400)
     *         or Data not found (status code 404)
     *         or Invalid input (status code 500)
     *         or Bad Gatway (status code 502)
     */
    @ApiOperation(value = "Adding a new customer", nickname = "customerPost", notes = "", tags={ "Customer Information", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Successful"),
        @ApiResponse(code = 400, message = "Bad request input"),
        @ApiResponse(code = 404, message = "Data not found"),
        @ApiResponse(code = 500, message = "Invalid input"),
        @ApiResponse(code = 502, message = "Bad Gatway") })
    @RequestMapping(value = "/customer",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> _customerPost(@ApiParam(value = "customer details that needs to be added" ,required=true )  @Valid @RequestBody CustomerDetails body) {
        return customerPost(body);
    }

    // Override this method
    default  ResponseEntity<Void> customerPost(CustomerDetails body) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
