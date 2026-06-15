
package com.lol.api.models;

import com.lol.api.enums.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {}