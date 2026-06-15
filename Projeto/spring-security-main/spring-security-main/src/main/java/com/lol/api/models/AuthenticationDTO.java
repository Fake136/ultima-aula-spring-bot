package com.lol.api.models;

import com.lol.api.enums.UserRole;

public record AuthenticationDTO(String login, String password) {}

