package com.apptware.interview.spring.beans;

import org.springframework.stereotype.Component;

@Component
public class OnDemandB extends BaseOnDemand {

 public OnDemandB(String someString) {
    super(someString);
  }

  @Override
  public SomeEnum getSomeEnum() {
    return SomeEnum.SOME_ENUM_B;
  }
}
