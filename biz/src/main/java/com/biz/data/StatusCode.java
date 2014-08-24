package com.biz.data;

import java.io.Serializable;

/**
 * Service status code to be returned by REST Service.
 * @author ankit.verma
 *
 */
public enum StatusCode implements Serializable {
   /** Represents success Message.
    */
   SUCCESS,
   /**
    * Represents Generic Failure
    */
   FAILURE,
   /**
    * Represents Invalid operation
    */
   INVALID_OPERATION   
}
