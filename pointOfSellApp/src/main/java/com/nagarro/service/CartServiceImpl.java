/**
 * 
 */
package com.nagarro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nagarro.model.Cart;
import com.nagarro.repository.CartRepository;

/**
 * @author vijaysharma01
 *
 */

@Transactional
@Service("cartService")
public class CartServiceImpl implements CartService{

	@Autowired
	private CartRepository cartRepository;

	@Override
	public long save(Cart cart) {
		return cartRepository.save(cart);
	}
}
