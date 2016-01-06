/**
 * Copyright (C) 2014 android10.org. All rights reserved.
 * @author Fernando Cejas (the android10 coder)
 */
package com.example.hangman.executor;


/**
 * 执行请求
 */
public interface ThreadExecutor {
  /**
   * Executes a {@link Runnable}.
   *
   * @param runnable The class that implements {@link Runnable} interface.
   */
  void execute(final Runnable runnable);
}
