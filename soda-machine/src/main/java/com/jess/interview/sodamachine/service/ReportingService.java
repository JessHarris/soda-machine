package com.jess.interview.sodamachine.service;

import com.jess.interview.sodamachine.entity.Soda;

import java.io.IOException;
import java.nio.file.Path;

public interface ReportingService {

    void doReporting(Soda soda, Path file) throws IOException;
}
