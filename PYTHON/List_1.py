row1 = int ( input ( "Enter The First Row Number :" ))
col1 = int ( input ( "Enter The First Column Number :" ))

row2 = int ( input ( "Enter The Second Row Number :" ))
col2 = int ( input ( "Enter The Second Column Number :" ))

matrix_A = []
matrix_B = []
sum = []

for i in range ( row1 ) :
    row_wise1 = []
    for j in range ( col1 ) :
        inpt1 = int ( input ( "Enter A Input Number :" ) )
        row_wise1.append ( inpt1 )
    matrix_A.append ( row_wise1 )
print ( "Your Matrix A Is : ", matrix_A )

for i in range ( row2 ) :
    row_wise2 = []
    for j in range ( col2 ) :
        inpt2 = int ( input ( "Enter A Input Number :" ) )
        row_wise2.append ( inpt2 )
    matrix_B.append ( row_wise2 )
print ( "Your Matrix B Is : ", matrix_B )

if row1 == row2 and col1 == col2 :
    for i in range ( row1 ) :
        row_wise_sum = []
        for j in range ( col1 ) :
            sum1 = matrix_A[ i ][ j ] + matrix_B[ i ][ j ]
            row_wise_sum.append ( sum1 )
        sum.append ( row_wise_sum )
        
print ( "Your Sum Matrix Is : ", sum )