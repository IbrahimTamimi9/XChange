package org.knowm.xchange.bitz.dto.marketdata.result;

import org.knowm.xchange.bitz.dto.BitZResult;
import org.knowm.xchange.bitz.dto.marketdata.BitZKline;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BitZKlineResult extends BitZResult<BitZKline> {

  public BitZKlineResult(
      @JsonProperty("code") int code,
      @JsonProperty("msg") String message,
      @JsonProperty("data") BitZKline data) {
    super(code, message, data);
  }
}
