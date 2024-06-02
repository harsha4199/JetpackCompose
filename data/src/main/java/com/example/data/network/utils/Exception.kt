package com.example.data.network.utils

/*** Created by
Harsha Devnani
 ***/

import java.io.IOException

class ApiException(message: String) : IOException(message)

class NoInternetException(message: String) : IOException(message)