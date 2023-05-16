/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.3.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.nxg.nxgecomm.api;

import com.nxg.nxgecomm.api.model.OrderProducts;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-15T12:19:21.972986800+05:30[Asia/Calcutta]")

@Validated
@Api(value = "orderproducts", description = "the orderproducts API")
public interface OrderproductsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /orderproducts : Getting all Order Products details
     *
     * @return A list of all Order Products details (status code 200)
     *         or Successful (status code 201)
     *         or Bad request input (status code 400)
     *         or Data not found (status code 404)
     *         or Invalid input (status code 500)
     *         or Bad Gatway (status code 502)
     */
    @ApiOperation(value = "Getting all Order Products details", nickname = "orderproductsGet", notes = "", response = OrderProducts.class, tags={ "Order Products Information", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A list of all Order Products details", response = OrderProducts.class),
        @ApiResponse(code = 201, message = "Successful"),
        @ApiResponse(code = 400, message = "Bad request input"),
        @ApiResponse(code = 404, message = "Data not found"),
        @ApiResponse(code = 500, message = "Invalid input"),
        @ApiResponse(code = 502, message = "Bad Gatway") })
    @RequestMapping(value = "/orderproducts",
        produces = { "applicantion/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<OrderProducts> _orderproductsGet() {
        return orderproductsGet();
    }

    // Override this method
    default  ResponseEntity<OrderProducts> orderproductsGet() {
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
     * DELETE /orderproducts/{orderId} : Delete a Order Products
     *
     * @param orderId  (required)
     * @return Successful (status code 201)
     *         or Bad request input (status code 400)
     *         or Data not found (status code 404)
     *         or Invalid input (status code 500)
     *         or Bad Gatway (status code 502)
     */
    @ApiOperation(value = "Delete a Order Products", nickname = "orderproductsOrderIdDelete", notes = "", tags={ "Order Products Information", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Successful"),
        @ApiResponse(code = 400, message = "Bad request input"),
        @ApiResponse(code = 404, message = "Data not found"),
        @ApiResponse(code = 500, message = "Invalid input"),
        @ApiResponse(code = 502, message = "Bad Gatway") })
    @RequestMapping(value = "/orderproducts/{orderId}",
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> _orderproductsOrderIdDelete(@ApiParam(value = "",required=true) @PathVariable("orderId") Integer orderId) {
        return orderproductsOrderIdDelete(orderId);
    }

    // Override this method
    default  ResponseEntity<Void> orderproductsOrderIdDelete(Integer orderId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /orderproducts/{orderId} : Getting Order Products details by id
     *
     * @param orderId  (required)
     * @return A list of a order Products details (status code 200)
     *         or Successful (status code 201)
     *         or Bad request input (status code 400)
     *         or Data not found (status code 404)
     *         or Invalid input (status code 500)
     *         or Bad Gatway (status code 502)
     */
    @ApiOperation(value = "Getting Order Products details by id", nickname = "orderproductsOrderIdGet", notes = "", response = OrderProducts.class, tags={ "Order Products Information", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A list of a order Products details", response = OrderProducts.class),
        @ApiResponse(code = 201, message = "Successful"),
        @ApiResponse(code = 400, message = "Bad request input"),
        @ApiResponse(code = 404, message = "Data not found"),
        @ApiResponse(code = 500, message = "Invalid input"),
        @ApiResponse(code = 502, message = "Bad Gatway") })
    @RequestMapping(value = "/orderproducts/{orderId}",
        produces = { "applicantion/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<OrderProducts> _orderproductsOrderIdGet(@ApiParam(value = "",required=true) @PathVariable("orderId") Integer orderId) {
        return orderproductsOrderIdGet(orderId);
    }

    // Override this method
    default  ResponseEntity<OrderProducts> orderproductsOrderIdGet(Integer orderId) {
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
     * PUT /orderproducts/{orderId} : Editing Order Products details
     *
     * @param orderId  (required)
     * @param body Order Products details that need to be added (required)
     * @return A list of a Order Products details (status code 200)
     *         or Successful (status code 201)
     *         or Bad request input (status code 400)
     *         or Data not found (status code 404)
     *         or Invalid input (status code 500)
     *         or Bad Gatway (status code 502)
     */
    @ApiOperation(value = "Editing Order Products details", nickname = "orderproductsOrderIdPut", notes = "", response = OrderProducts.class, tags={ "Order Products Information", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A list of a Order Products details", response = OrderProducts.class),
        @ApiResponse(code = 201, message = "Successful"),
        @ApiResponse(code = 400, message = "Bad request input"),
        @ApiResponse(code = 404, message = "Data not found"),
        @ApiResponse(code = 500, message = "Invalid input"),
        @ApiResponse(code = 502, message = "Bad Gatway") })
    @RequestMapping(value = "/orderproducts/{orderId}",
        produces = { "applicantion/json" }, 
        consumes = { "applicantion/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<OrderProducts> _orderproductsOrderIdPut(@ApiParam(value = "",required=true) @PathVariable("orderId") Integer orderId,@ApiParam(value = "Order Products details that need to be added" ,required=true )  @Valid @RequestBody OrderProducts body) {
        return orderproductsOrderIdPut(orderId, body);
    }

    // Override this method
    default  ResponseEntity<OrderProducts> orderproductsOrderIdPut(Integer orderId, OrderProducts body) {
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
     * POST /orderproducts : Adding a new Order Products
     *
     * @param body Order Products details that needs to be added (required)
     * @return Successful (status code 201)
     *         or Bad request input (status code 400)
     *         or Data not found (status code 404)
     *         or Invalid input (status code 500)
     *         or Bad Gatway (status code 502)
     */
    @ApiOperation(value = "Adding a new Order Products", nickname = "orderproductsPost", notes = "", tags={ "Order Products Information", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Successful"),
        @ApiResponse(code = 400, message = "Bad request input"),
        @ApiResponse(code = 404, message = "Data not found"),
        @ApiResponse(code = 500, message = "Invalid input"),
        @ApiResponse(code = 502, message = "Bad Gatway") })
    @RequestMapping(value = "/orderproducts",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> _orderproductsPost(@ApiParam(value = "Order Products details that needs to be added" ,required=true )  @Valid @RequestBody OrderProducts body) {
        return orderproductsPost(body);
    }

    // Override this method
    default  ResponseEntity<Void> orderproductsPost(OrderProducts body) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}