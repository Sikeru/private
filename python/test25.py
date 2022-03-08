def power(item):
    return item * item
def under_3(item):
    return item<3

list_input_a = [1, 2, 3, 4, 5]
output_a = map(power, list_input_a)
print("map() : ", output_a)
print("map() : ", list(output_a))

output_b = filter(under_3, list_input_a)
print("filter() : ", output_b)
print("filter() : ", list(output_b))

output_c = map(lambda x:x*x, list_input_a)
print(list(output_c))
output_d = filter(lambda x:x<3, list_input_a)
print(list(output_d))