package com.apptware.interview.spring.beans;

import org.springframework.stereotype.Component;

@Component
public class OnDemandA extends BaseOnDemand {

 public OnDemandA(String someString) {
    super(someString);
  }

  @Override
  public SomeEnum getSomeEnum() {
    return SomeEnum.SOME_ENUM_A;
  }
}
