package com.devskiller.jfairy.producer.Product;

import com.devskiller.jfairy.data.DataMaster;
import com.devskiller.jfairy.producer.BaseProducer;
import com.google.common.annotations.VisibleForTesting;
import com.google.inject.Provider;

import javax.inject.Inject;

public class ProductProvider  implements Provider<Product> {

	private final DataMaster dataMaster;
	private final BaseProducer baseProducer;
	@VisibleForTesting
	public String PRODUCT_NAMES = "productNames";
	@VisibleForTesting
	public String PRODUCT_TYPES = "productTypes";
	@VisibleForTesting
	public String PRODUCT_CODES = "productCodes";

	@Inject
	public ProductProvider(DataMaster dataMaster, BaseProducer baseProducer) {
		this.dataMaster = dataMaster;
		this.baseProducer = baseProducer;
	}

	@Override
	public Product get() {
		return setDefaultValues(new Product());
	}

	private Product setDefaultValues(Product product){
		product.setProductId( baseProducer.numerify("ID_#_#") );
		product.setName( dataMaster.getRandomValue(PRODUCT_NAMES));
		product.setType( dataMaster.getRandomValue(PRODUCT_TYPES));
		product.setApplicationCode( dataMaster.getRandomValue(PRODUCT_CODES));
		return product;
	}
}
