/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.3.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.nxg.nxgecomm.api;

import com.nxg.nxgecomm.api.model.Orders;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-24T14:14:37.533751100+05:30[Asia/Calcutta]")

@Validated
@Api(value = "orders", description = "the orders API")
public interface OrdersApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /orders : Getting all Orders  details
     *
     * @return A list of all Orders details (status code 200)
     *         or Successful (status code 201)
     *         or Bad request input (status code 400)
     *         or Data not found (status code 404)
     *         or Invalid input (status code 500)
     *         or Bad Gatway (status code 502)
     */
    @ApiOperation(value = "Getting all Orders  details", nickname = "ordersGet", notes = "", response = Orders.class, tags={ "Orders Information", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A list of all Orders details", response = Orders.class),
        @ApiResponse(code = 201, message = "Successful"),
        @ApiResponse(code = 400, message = "Bad request input"),
        @ApiResponse(code = 404, message = "Data not found"),
        @ApiResponse(code = 500, message = "Invalid input"),
        @ApiResponse(code = 502, message = "Bad Gatway") })
    @RequestMapping(value = "/orders",
        produces = { "applicantion/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Orders> _ordersGet() {
        return ordersGet();
    }

    // Override this method
    default  ResponseEntity<Orders> ordersGet() {
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
     * DELETE /orders/{orderId} : Delete a Orders
     *
     * @param orderId  (required)
     * @return Successful (status code 201)
     *         or Bad request input (status code 400)
     *         or Data not found (status code 404)
     *         or Invalid input (status code 500)
     *         or Bad Gatway (status code 502)
     */
    @ApiOperation(value = "Delete a Orders", nickname = "ordersOrderIdDelete", notes = "", tags={ "Orders Information", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Successful"),
        @ApiResponse(code = 400, message = "Bad request input"),
        @ApiResponse(code = 404, message = "Data not found"),
        @ApiResponse(code = 500, message = "Invalid input"),
        @ApiResponse(code = 502, message = "Bad Gatway") })
    @RequestMapping(value = "/orders/{orderId}",
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> _ordersOrderIdDelete(@ApiParam(value = "",required=true) @PathVariable("orderId") Integer orderId) {
        return ordersOrderIdDelete(orderId);
    }

    // Override this method
    default  ResponseEntity<Void> ordersOrderIdDelete(Integer orderId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /orders/{orderId} : Getting Orders details by id
     *
     * @param orderId  (required)
     * @return A list of a orders details (status code 200)
     *         or Successful (status code 201)
     *         or Bad request input (status code 400)
     *         or Data not found (status code 404)
     *         or Invalid input (status code 500)
     *         or Bad Gatway (status code 502)
     */
    @ApiOperation(value = "Getting Orders details by id", nickname = "ordersOrderIdGet", notes = "", response = Orders.class, tags={ "Orders Information", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A list of a orders details", response = Orders.class),
        @ApiResponse(code = 201, message = "Successful"),
        @ApiResponse(code = 400, message = "Bad request input"),
        @ApiResponse(code = 404, message = "Data not found"),
        @ApiResponse(code = 500, message = "Invalid input"),
        @ApiResponse(code = 502, message = "Bad Gatway") })
    @RequestMapping(value = "/orders/{orderId}",
        produces = { "applicantion/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Orders> _ordersOrderIdGet(@ApiParam(value = "",required=true) @PathVariable("orderId") Integer orderId) {
        return ordersOrderIdGet(orderId);
    }

    // Override this method
    default  ResponseEntity<Orders> ordersOrderIdGet(Integer orderId) {
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
     * PUT /orders/{orderId} : Editing Orders details
     *
     * @param orderId  (required)
     * @param body Orders details that need to be added (required)
     * @return A list of a Orders details (status code 200)
     *         or Successful (status code 201)
     *         or Bad request input (status code 400)
     *         or Data not found (status code 404)
     *         or Invalid input (status code 500)
     *         or Bad Gatway (status code 502)
     */
    @ApiOperation(value = "Editing Orders details", nickname = "ordersOrderIdPut", notes = "", response = Orders.class, tags={ "Orders Information", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A list of a Orders details", response = Orders.class),
        @ApiResponse(code = 201, message = "Successful"),
        @ApiResponse(code = 400, message = "Bad request input"),
        @ApiResponse(code = 404, message = "Data not found"),
        @ApiResponse(code = 500, message = "Invalid input"),
        @ApiResponse(code = 502, message = "Bad Gatway") })
    @RequestMapping(value = "/orders/{orderId}",
        produces = { "applicantion/json" }, 
        consumes = { "applicantion/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<Orders> _ordersOrderIdPut(@ApiParam(value = "",required=true) @PathVariable("orderId") Integer orderId,@ApiParam(value = "Orders details that need to be added" ,required=true )  @Valid @RequestBody Orders body) {
        return ordersOrderIdPut(orderId, body);
    }

    // Override this method
    default  ResponseEntity<Orders> ordersOrderIdPut(Integer orderId, Orders body) {
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
     * POST /orders : Adding a new Orders
     *
     * @param body Orders details that needs to be added (required)
     * @return Successful (status code 201)
     *         or Bad request input (status code 400)
     *         or Data not found (status code 404)
     *         or Invalid input (status code 500)
     *         or Bad Gatway (status code 502)
     */
    @ApiOperation(value = "Adding a new Orders", nickname = "ordersPost", notes = "", tags={ "Orders Information", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Successful"),
        @ApiResponse(code = 400, message = "Bad request input"),
        @ApiResponse(code = 404, message = "Data not found"),
        @ApiResponse(code = 500, message = "Invalid input"),
        @ApiResponse(code = 502, message = "Bad Gatway") })
    @RequestMapping(value = "/orders",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> _ordersPost(@ApiParam(value = "Orders details that needs to be added" ,required=true )  @Valid @RequestBody Orders body) {
        return ordersPost(body);
    }

    // Override this method
    default  ResponseEntity<Void> ordersPost(Orders body) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
