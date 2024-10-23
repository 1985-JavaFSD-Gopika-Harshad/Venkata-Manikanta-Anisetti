package com.manikanta.www.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SupplierRequest {
	 private String name;
	 private String email;
}
